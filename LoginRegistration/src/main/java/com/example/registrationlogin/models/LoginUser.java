package com.example.registrationlogin.models;

import jakarta.validation.constraints.*;

public class LoginUser {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    // Getters and setters
}
