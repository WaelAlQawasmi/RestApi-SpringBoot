package com.example.restApi.Security;

import java.util.List;

public class JwtResponse {
String token;
String email;
    List<String>  roles;
        Long id;
String username;
    public JwtResponse(String accessToken, Long id, String username, String email, List<String>  roles) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
