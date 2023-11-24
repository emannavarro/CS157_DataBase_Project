package com.example.databaseProject.studentsystem.service;

import com.example.databaseProject.studentsystem.model.Customer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Customer> getCustomers() {
        return List.of(
                new Customer("1", "Andrew", "Pun", "123 Baker St", "San Jose", "CA", "12345", "USA", "ap@gmail.com"));

    }
}