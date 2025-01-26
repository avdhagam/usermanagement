package com.example.service.impl;

import com.example.UserRepository;
import com.example.io.entity.UserEntity;
import com.example.service.UserService;
import com.example.ui.shared.dto.UserDto;
import com.example.ui.shared.dto.Utils;
import jdk.jshell.execution.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    Utils utils;

    @Override
    public UserDto createUser(UserDto userDto) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto,userEntity);
        userEntity.setEncryptedPassword("test");
        userEntity.setUserId(utils.generateUserId(30));
        System.out.println("Generated UserId: " + userEntity.getUserId());

        UserEntity storedUserDetails = userRepository.save(userEntity);
        UserDto userDto1 = new UserDto();
        BeanUtils.copyProperties(storedUserDetails,userDto1);
        return userDto1;
    }
}
