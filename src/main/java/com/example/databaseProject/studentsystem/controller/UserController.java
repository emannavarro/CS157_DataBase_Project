package com.example.databaseProject.studentsystem.controller;

import com.example.databaseProject.studentsystem.model.User;
import com.example.databaseProject.studentsystem.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
// @CrossOrigin
public class UserController {
    @Autowired
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // @PostMapping("/add")
    // public String add(@RequestBody Customer student) {
    // studentService.saveStudent(student);
    // return "New student is added";
    // }

    @GetMapping
    public List<User> list() {
        return userService.getUsers();
    }

    @PostMapping
    public void reigsterNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userService.deleteUser(userID);
    }

}