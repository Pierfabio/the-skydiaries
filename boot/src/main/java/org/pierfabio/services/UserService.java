package org.pierfabio.services;

import org.pierfabio.entities.User;
import org.pierfabio.mongo.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"org.pierfabio.mongo"})
@EnableMongoRepositories("org.pierfabio.mongo.interfaces")
public class UserService {

    @Autowired
    private UserInterface userInterface;

    public User insertUser(User user){
        return userInterface.insert(user);
    }
}
