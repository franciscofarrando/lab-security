package com.example.security_lab.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {
    private static final String SECRET = "super_secreto123";

    public String generateToken(String username, String role){
        return JWT.create()
                .withSubject(username)
                .withClaim("role", role)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*24))
                .sign(Algorithm.HMAC256(SECRET));
    }
}
