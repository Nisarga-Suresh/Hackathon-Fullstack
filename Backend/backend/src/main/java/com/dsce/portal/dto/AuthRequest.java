package com.dsce.portal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class AuthRequest {
    
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;
    
    @NotBlank(message = "Password is required")
    private String password;
    
    private String userType; // Optional, for specific login types
    
    // Constructors
    public AuthRequest() {}
    
    public AuthRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public AuthRequest(String email, String password, String userType) {
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    
    // Getters and Setters
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
}