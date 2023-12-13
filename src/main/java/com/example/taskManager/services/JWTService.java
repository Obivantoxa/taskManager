package com.example.taskManager.services;

import com.example.taskManager.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

public interface JWTService {

    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token,UserDetails userDetails);

    String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
}
