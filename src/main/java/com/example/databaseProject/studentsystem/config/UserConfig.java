package com.example.databaseProject.studentsystem.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.List;

import com.example.databaseProject.studentsystem.model.User;
import com.example.databaseProject.studentsystem.repository.UserRepository;

import org.springframework.context.annotation.Bean;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User bob = new User("Bob",
                    "Bobby",
                    "123 Apple st",
                    "SJ",
                    "SJ",
                    "95123",
                    "USA",
                    "Bob@sjsu.edu");
            repository.saveAll(List.of(bob));
        };
    }
}
