package com.websecurity.models;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("users")
public class User {

    private String id;
    private String userName;

    @Indexed(unique=true)
    private String email;

    private String password;
    private boolean enabled;
    private List<Applications> applicationsList;



    public String  getId() {
        return id;
    }

    public User setId(String  id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public User setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    public List<Applications> getApplicationsList() {
        return applicationsList;
    }

    public User setApplicationsList(List<Applications> applicationsList) {
        this.applicationsList = applicationsList;
        return this;
    }


    @Override
    public String toString() {
        return "com.websecurity.models.User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", applicationsList=" + applicationsList +
                '}';
    }
}
