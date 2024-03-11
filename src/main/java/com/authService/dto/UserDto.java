package com.authService.dto;

import com.authService.entities.User;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserDto extends User {
    private String firstName; // first_name
    private String lastName; //last_name
    private Long phoneNumber;
    private String email; // email
}
