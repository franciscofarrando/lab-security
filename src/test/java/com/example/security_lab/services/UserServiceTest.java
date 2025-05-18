package com.example.security_lab.services;

import com.example.security_lab.models.User;
import com.example.security_lab.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {
    private User user;
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    public void setUp(){
        user = new User();
        user.setUsername("Test2");
        user.setPassword("1234");
        System.out.println("Usuario Inicial: " + user);

        userService.saveUser(user);
    }
        //@AfterEach
//public void tearDown(){
        //userRepository.delete(user);
//}
    @Test
    @DisplayName("Encriptacion Correcta")
    public void passwordEncryption(){
        assertTrue(user.getPassword().startsWith("$2a$"));
        System.out.println("User Final: " + user);
    }
}
