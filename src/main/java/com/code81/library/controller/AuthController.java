package com.code81.library.controller;

import com.code81.library.config.JwtUtil;
import com.code81.library.dto.AuthRequest;
import com.code81.library.dto.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        try {
            authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );

            String token = jwtUtil.generateToken(request.getUsername());
            return new AuthResponse(token);
        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
