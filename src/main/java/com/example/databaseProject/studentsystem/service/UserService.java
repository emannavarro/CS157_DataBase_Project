package com.example.databaseProject.studentsystem.service;

import com.example.databaseProject.studentsystem.model.User;
import com.example.databaseProject.studentsystem.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmailAddress());
        if (userOptional.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        userRepository.save(user);
    }

    public void deleteUser(int userID) {
        boolean exists = userRepository.existsById(userID);
        if (!exists) {
            throw new IllegalStateException("student with id: " + userID + " does not exist");
        }
        userRepository.deleteById(userID);
    }
}