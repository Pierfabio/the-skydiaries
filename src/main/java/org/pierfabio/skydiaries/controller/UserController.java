package org.pierfabio.skydiaries.controller;




import org.pierfabio.skydiaries.model.User;
import org.pierfabio.skydiaries.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<User> findUser(String firstName) throws Exception{
        User result = userRepository.findByFirstName(firstName);
        return new ResponseEntity<User>(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody  User user){
        User created = userRepository.save(user);
        return new ResponseEntity<User>(created, HttpStatus.CREATED);
    }

}
