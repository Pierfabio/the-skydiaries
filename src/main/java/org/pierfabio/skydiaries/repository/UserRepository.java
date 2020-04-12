package org.pierfabio.skydiaries.repository;

import org.pierfabio.skydiaries.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


    User save(User user);

    User findByFirstName(String firstName);

}
