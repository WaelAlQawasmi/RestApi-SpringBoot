package com.example.restApi.Security;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor

public class LoginRequest {
    String username;
    String password;
}
