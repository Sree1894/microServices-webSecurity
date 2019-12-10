package com.websecurity.Applicationservices.Controllers;

import com.websecurity.Applicationservices.Services.ApplicationService;
import com.websecurity.models.ApiResponse;
import com.websecurity.models.ApiResponseEnums;
import com.websecurity.models.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ApplicationControllers {

    @Autowired
    ApplicationService applicationService;


    @PostMapping("/application/{userid}")
    private ApiResponse createApplication(@RequestBody Applications applications, @PathVariable String userid){

        List<Applications> applicationsList=applicationService.createApplication(applications,userid);

        return  applicationsList!=null ?
                new ApiResponse(true, ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(),applicationsList ):
                new ApiResponse(false,ApiResponseEnums.API_RESPONSE_FAILED.getMessage(),null);

    }


    @PutMapping("/application/{userid}")
    private ApiResponse updateApplication(@RequestBody Applications applications,@PathVariable String userid){

        Applications applicationsList=applicationService.updateApplication(applications,userid);

        return  applicationsList!=null ?
                new ApiResponse(true,ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(),applicationsList) :
                new ApiResponse(false,ApiResponseEnums.API_RESPONSE_FAILED.getMessage(),null);

    }

    @DeleteMapping("/application")
    private ApiResponse deleteApplication(@RequestParam String userid,@RequestParam String applicationName){

        List<Applications> applicationsList=applicationService.deleteApplication(userid,applicationName);

        return  applicationsList!=null ?
                new ApiResponse(true,ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(),applicationsList) :
                new ApiResponse(false,ApiResponseEnums.API_RESPONSE_FAILED.getMessage(),null);
    }
}
