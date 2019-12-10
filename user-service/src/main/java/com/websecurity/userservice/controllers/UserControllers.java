package com.websecurity.userservice.controllers;

import com.websecurity.userservice.Services.UserService;
import com.websecurity.models.ApiResponse;
import com.websecurity.models.ApiResponseEnums;
import com.websecurity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController()
@RequestMapping("/v1")
public class UserControllers {

    @Autowired
    UserService userService;


    @PostMapping("/user")
    public ApiResponse createUser(@RequestBody User user){

        System.out.println("create user ");
        User user1=userService.createUser(user);
        return user1!=null ?
                new ApiResponse(true, ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(), user1) :
                new ApiResponse(false, ApiResponseEnums.API_RESPONSE_FAILED.getMessage(), null);
    }



    @GetMapping("/users")
    public ApiResponse allUsers() {

        return userService.allUsers()!=null ?
                new ApiResponse(true, ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(), userService.allUsers()) :
                new ApiResponse(false, ApiResponseEnums.API_RESPONSE_FAILED.getMessage(), null);
    }


    @GetMapping("/user/{userid}")
    public ApiResponse getUser(@PathVariable String userid) {

        Optional<User> user=userService.findById(userid);

        return user.isPresent() ?
                new ApiResponse(true, ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(), user) :
                new ApiResponse(false, ApiResponseEnums.API_RESPONSE_FAILED.getMessage(), null);

    }

    @PutMapping("/user")
    public ApiResponse updateUser(@RequestBody User user){

        User user1=null;
        if (user.getId() !=null){
            user1=userService.updateUser(user);
        }

        return  user1 !=null ?
                new ApiResponse(true,ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(),user1) :
                new ApiResponse(false,ApiResponseEnums.API_RESPONSE_FAILED.getMessage(),null);
    }

    @DeleteMapping("/user/{userId}")
    public ApiResponse deleteUser(@PathVariable(name = "userId") String userId){

        userService.deleteUser(userId);

        return new ApiResponse(true,ApiResponseEnums.API_RESPONSE_SUCCESS.getMessage(),null);
    }

    @GetMapping("/app")
    public void getapps(){

    }

}
