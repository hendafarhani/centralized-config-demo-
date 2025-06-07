package com.demo.service_one.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
    @Value("${message}")
    private String message;

    @GetMapping("/hello")
    public String hello() {
        return message;
    }
}
