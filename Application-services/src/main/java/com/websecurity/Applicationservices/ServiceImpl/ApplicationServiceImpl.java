package com.websecurity.Applicationservices.ServiceImpl;


import com.websecurity.Applicationservices.Repositories.UserRepositories;
import com.websecurity.Applicationservices.Services.ApplicationService;
import com.websecurity.models.ApiResponse;
import com.websecurity.models.Applications;
import com.websecurity.models.Scans;
import com.websecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;


@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    UserRepositories userRepositories;


    @Override
    public List<Applications> createApplication(Applications applications, String userId) {

        applications.setApplicationScanDetails(Arrays.asList(new Scans()))
                    .setApplicationCreatedDate(String.valueOf(LocalDateTime.now()))
                    .setEnabled(true);

        User user= userRepositories.findById(userId).orElse(null);

        if (user !=null){
            user.getApplicationsList().add(applications);
            return  mongoTemplate.save(user).getApplicationsList();
        }

      return null;
    }



    @Override
    public Applications updateApplication(Applications applications,String userid) {

        final Query query = new Query(new Criteria().andOperator(
                where("_id").is(userid),
                where("applicationsList").elemMatch(where("applicationId").is(applications.getApplicationId()))));

        applications.setApplicationUpdatedDate(String.valueOf(LocalDateTime.now()));

        Update update = new Update().set("applicationsList.$.applicationName", applications.getApplicationName());

        mongoTemplate.updateFirst(query, update, User.class);

        return applications;
    }

    @Override
    public List<Applications> deleteApplication(String userid, String applicationName) {

        User e = mongoTemplate.findOne
                (new Query(where("id").is(userid)), User.class);

        if (e != null) {
            List<Applications>  applicationsList=e.getApplicationsList();
            applicationsList.removeIf(n->(n.getApplicationName().equalsIgnoreCase(applicationName)));

            return   mongoTemplate.save(e).getApplicationsList();
        }

        return null;
    }


    @Override
    public Applications findById(String appId) {
        Applications e = mongoTemplate.findOne
                (new Query(where("application.$applicationName").is(appId)), Applications.class);
        return e;

    }


}
