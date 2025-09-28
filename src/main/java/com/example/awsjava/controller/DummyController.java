package com.example.awsjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DummyController {

    @GetMapping("/hello")
    public String dummy() {
        return "Hello World!";
    }

    @PostMapping("/post")
    public String dummyPost() {
        return "Hello World from Post!";
    }

    @GetMapping("/hello/{name}" )
    public String dummyWithPathVariable(String name) {
        return "Hello " + name;
    }
}
