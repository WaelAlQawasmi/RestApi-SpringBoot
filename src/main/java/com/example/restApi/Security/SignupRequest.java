package com.example.restApi.Security;

import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor

public class SignupRequest {
    String username;
    String password;
    String email;
    Set<String> role;
}
