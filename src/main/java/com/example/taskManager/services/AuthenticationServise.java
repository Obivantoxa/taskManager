package com.example.taskManager.services;

import com.example.taskManager.dto.JwtAuthenticationResponse;
import com.example.taskManager.dto.RefreshTokenRequest;
import com.example.taskManager.dto.SignInRequest;
import com.example.taskManager.dto.SignUpRequest;
import com.example.taskManager.entity.User;

public interface AuthenticationServise {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
