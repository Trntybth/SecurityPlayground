package com.northcoders.example.SecurityPlayground.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
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

    @GetMapping("/protected/greeting") ResponseEntity<String> protectedGreeting(@AuthenticationPrincipal OAuth2User user){

        String userName = (String) user.getAttributes().get("login");
        return new ResponseEntity<>("Welcome to the website " + userName + "!", HttpStatus.OK);
    }
}
