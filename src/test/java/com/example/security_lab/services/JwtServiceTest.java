package com.example.security_lab.services;

import com.example.security_lab.repositories.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JwtServiceTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    JwtService jwtService;
    @Test
    @DisplayName("Genera token")
    void generateToken(){
        String token = jwtService.generateToken("Marcel", "ROLE_ADMIN");
        System.out.println("TOKEN: " + token);
    }
}
