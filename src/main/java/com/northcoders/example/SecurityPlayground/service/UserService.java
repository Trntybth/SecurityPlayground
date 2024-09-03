package com.northcoders.example.SecurityPlayground.service;
import com.northcoders.example.SecurityPlayground.controller.GreetingController;
import com.northcoders.example.SecurityPlayground.model.User;
import com.northcoders.example.SecurityPlayground.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class UserService implements OAuth2UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        return null;
    }


}