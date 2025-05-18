package com.example.security_lab.controllers;

import jakarta.persistence.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class BasicController {
    @GetMapping("/cosas-importantes")
    public ResponseEntity<String> cosasImportantes(){
        return ResponseEntity.ok("Info privada");

    }
    @GetMapping("/public/users")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("Info publica");
    }
}
