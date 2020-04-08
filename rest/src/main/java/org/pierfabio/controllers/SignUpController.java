package org.pierfabio.controllers;

import org.pierfabio.beans.User;
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

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Validated User user) throws Exception{
        //to-do add call to create-user
        return new ResponseEntity<>(new User(), HttpStatus.CREATED);
    }
}
