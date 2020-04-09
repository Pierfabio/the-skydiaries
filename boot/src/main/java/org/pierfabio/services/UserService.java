package org.pierfabio.services;

import org.pierfabio.entities.User;
import org.pierfabio.mongo.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserService {

    @Autowired
    private UserInterface userInterface;

    public User insertUser(User user){
        return userInterface.insert(user);
    }
}
