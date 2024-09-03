package com.northcoders.example.SecurityPlayground.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/api/v1/open/**").permitAll(); // searching for regex in url
                    auth.requestMatchers("/api/v1/protected/**").authenticated();
                })
                .formLogin(withDefaults());
        return http.build();
    }

}
