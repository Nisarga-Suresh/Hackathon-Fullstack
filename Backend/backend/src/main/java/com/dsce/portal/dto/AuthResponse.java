package com.dsce.portal.dto;

public class AuthResponse {
    
    private String token;
    private String userType;
    private Long userId;
    private String name;
    private String email;
    private String message;
    
    // Constructors
    public AuthResponse() {}
    
    public AuthResponse(String token, String userType, Long userId, String name, String email, String message) {
        this.token = token;
        this.userType = userType;
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.message = message;
    }
    
    // Getters and Setters
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}