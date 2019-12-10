package com.websecurity.userservice.Services;


import com.websecurity.models.User;

import java.util.Optional;

public interface UserService {


    User createUser(User user);

    User updateUser(User user);

    void deleteUser(String userId);

    Optional<User> findById(String empid);

    Iterable<User> allUsers();

    User findByUserName(String userName);

    User findbyUserEmail(String email);



}
