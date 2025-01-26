package com.example.ui.shared.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

//Dto means data transfer object, this is the obj that will be passed around bw different layers

@Data
public class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean getEmailVerificationStatus = false;
}
