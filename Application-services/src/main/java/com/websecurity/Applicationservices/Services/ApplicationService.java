package com.websecurity.Applicationservices.Services;



import com.websecurity.models.Applications;

import java.util.List;

public interface ApplicationService {

    List<Applications> createApplication(Applications applications,String userId);

    Applications updateApplication(Applications applications,String userid);

    List<Applications> deleteApplication(String userid,String applicationName);

    Applications findById(String appId);
}
