package org.pierfabio.mongo.interfaces;

import org.pierfabio.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInterface extends MongoRepository<User, String> {

    User insert(User user);

    User findByFirstName(String firstName);

}
