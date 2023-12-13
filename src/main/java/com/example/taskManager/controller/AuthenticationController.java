package com.example.taskManager.controller;


import com.example.taskManager.dto.JwtAuthenticationResponse;
import com.example.taskManager.dto.RefreshTokenRequest;
import com.example.taskManager.dto.SignInRequest;
import com.example.taskManager.dto.SignUpRequest;
import com.example.taskManager.entity.User;
import com.example.taskManager.services.AuthenticationServise;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationServise authenticationServise;

    @PostMapping("/singup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authenticationServise.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest signInRequest) {
        return ResponseEntity.ok(authenticationServise.signIn(signInRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest) {
        return ResponseEntity.ok(authenticationServise.refreshToken(refreshTokenRequest));
    }
}
