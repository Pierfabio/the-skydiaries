package org.pierfabio.controller;


import org.pierfabio.entities.User;
import org.pierfabio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<User> findUser(String firstName) throws Exception{
        User result = userService.findByFirstName(firstName);
        return new ResponseEntity<User>(result, HttpStatus.OK);
    }

}
