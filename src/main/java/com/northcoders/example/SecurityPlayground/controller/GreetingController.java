package com.northcoders.example.SecurityPlayground.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("/open/greeting")
    public String openGreeting() {
        return "Hello..?";
    }

    @GetMapping("/protected/greeting")
    public String protectingGreeting() {
        return "Hello!!!!!";
    }

}
