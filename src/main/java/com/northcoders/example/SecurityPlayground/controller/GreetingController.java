package com.northcoders.example.SecurityPlayground.controller;


import com.northcoders.example.SecurityPlayground.model.User;
import com.northcoders.example.SecurityPlayground.repository.UserRepository;
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
public class GreetingController implements UserRepository {

    User user;

    @GetMapping("/open/greeting")
    public String openGreeting() {
        return "Hello..?";
    }

    @GetMapping("/protected/greeting") ResponseEntity<String> protectedGreeting(@AuthenticationPrincipal OAuth2User user){

        String userName = (String) user.getAttributes().get("login");

        this.user.setId((String) user.getAttributes().get("id"));
        this.user.setName((String) user.getAttributes().get("name"));
        this.user.setGithubUsername(userName);

        findByGithubUsername(userName);

        return new ResponseEntity<>("Welcome to the website " + userName + "!", HttpStatus.OK);
    }

    @Override
    public User findByGithubUsername(String username) {
        if (user.getGithubUsername().equals(username))
            return this.user;
        else return null;
    }
}
