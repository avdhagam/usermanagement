package com.example.ui.model.requests;

import lombok.Data;

@Data // getters and setters
public class UserDetailsRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
