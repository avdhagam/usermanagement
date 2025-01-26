package com.example.ui.model.responses;

import lombok.Data;

@Data
public class UserRest {
    private String userID;
    private String firstName;
    private String lastName;
    private String email;
    // dont return any sensitive info in the response object
}
