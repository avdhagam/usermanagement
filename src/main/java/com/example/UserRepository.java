package com.example;

import com.example.io.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <UserEntity,Long> {
    UserEntity findUserByEmail(String email);
}
