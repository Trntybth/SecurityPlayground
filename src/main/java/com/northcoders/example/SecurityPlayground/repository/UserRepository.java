package com.northcoders.example.SecurityPlayground.repository;

import com.northcoders.example.SecurityPlayground.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.List;

public interface UserRepository {

    User findByGithubUsername(String username);
}