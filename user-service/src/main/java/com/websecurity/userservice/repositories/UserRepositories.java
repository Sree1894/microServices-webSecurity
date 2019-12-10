package com.websecurity.userservice.repositories;


import com.websecurity.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositories extends MongoRepository<User,String> {

    User findByUserName(String username);

    User findByEmail(String email);


}
