package com.northcoders.example.SecurityPlayground.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class User {
    String id;
    String name;
    String githubUsername;
}
