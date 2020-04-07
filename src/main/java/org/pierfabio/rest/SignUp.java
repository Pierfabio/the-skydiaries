package org.pierfabio.rest;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/signup")
public class SignUp {

    public ResponseEntity<String> signUp(){
        return new ResponseEntity<String>("User1", HttpStatus.CREATED);
    }

}
