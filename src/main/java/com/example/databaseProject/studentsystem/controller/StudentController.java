package com.example.databaseProject.studentsystem.controller;

import com.example.databaseProject.studentsystem.model.Customer;
import com.example.databaseProject.studentsystem.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
// @CrossOrigin
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // @PostMapping("/add")
    // public String add(@RequestBody Customer student) {
    // studentService.saveStudent(student);
    // return "New student is added";
    // }

    @GetMapping
    public List<Customer> list() {
        return studentService.getCustomers();
    }

}