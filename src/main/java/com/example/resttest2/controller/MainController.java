package com.example.resttest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String getTestMessage() {
        return "This is a test of a Spring Boot Rest API hosted on Heroku";
    }
}
