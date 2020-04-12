package org.pierfabio.controller;



import org.pierfabio.model.User;
import org.pierfabio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Validated User user) throws Exception{
        User created = userRepository.save(user);
        return new ResponseEntity<User>(created, HttpStatus.CREATED);
    }
}
