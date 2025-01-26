package com.example.ui.controller;

import com.example.ui.model.requests.UserDetailsRequest;
import com.example.ui.model.responses.UserRest;
import com.example.ui.shared.dto.UserDto;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
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
    public UserRest createUser(@RequestBody UserDetailsRequest userDetailsRequest){
        UserRest response = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetailsRequest,userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser,response);
        
        return response;
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
