package com.example.ui.controller;

import org.springframework.web.bind.annotation.*;

// RestController is used to enable the class to receive http requests
@RestController
// RequestMapping is URL and path related
@RequestMapping("users") //  http://localhost:8080/users
public class UserController {
//    Binding our method to http get req
    @GetMapping
    public String getUser(){
        return "GetUser was called";
    }

    @PostMapping
    public String createUser(){
        return "createUser was called";
    }

    @PutMapping
    public String updateUser(){
        return "updateUser was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "deleteUser was called";
    }

}
