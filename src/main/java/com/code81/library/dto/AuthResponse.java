package com.code81.library.dto;

public class AuthResponse {
    private String token;

    public AuthResponse() {}

    public AuthResponse(String token) {
        this.token = token;
    }

    // --- Getter & Setter ---
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
