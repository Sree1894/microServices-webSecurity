package com.websecurity.userservice.ServiceImpl;



import com.websecurity.userservice.Services.UserService;
import com.websecurity.models.Applications;
import com.websecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.websecurity.userservice.repositories.UserRepositories;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositories userRepositories;

    @Autowired
    MongoTemplate mongoTemplate;




    @Override
    public Optional<User> findById(String id) {

        return userRepositories.findById(id);
    }

    @Override
    public Iterable<User> allUsers() {
        return userRepositories.findAll();
    }


    @Override
    public User createUser(User user) {

        user.setEnabled(true);
        List<Applications> newApplication=new ArrayList<>();
        user.setApplicationsList(newApplication);
        return  mongoTemplate.insert(user);
    }

    @Override
    public User updateUser(User user) {

        return userRepositories.save(user);
    }

    @Override
    public void deleteUser(String userId) {

        userRepositories.deleteById(userId);
    }


    @Override
    public User findByUserName(String userName) {
        return userRepositories.findByUserName(userName);
    }

    @Override
    public User findbyUserEmail(String email) {
        return userRepositories.findByEmail(email);
    }







}

