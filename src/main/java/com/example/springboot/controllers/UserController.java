package com.example.springboot.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(){
        return new ResponseEntity<>("" , HttpStatus.CREATED);
    }

}
