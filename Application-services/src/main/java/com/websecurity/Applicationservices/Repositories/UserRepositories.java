package com.websecurity.Applicationservices.Repositories;


import com.websecurity.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositories extends MongoRepository<User,String> {

}
