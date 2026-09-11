package com.example.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedEndpointController {
    @GetMapping("/api/protected")
    public String protectedEndpoint() {
        return "Este es un endpoint protegido";
    }
}