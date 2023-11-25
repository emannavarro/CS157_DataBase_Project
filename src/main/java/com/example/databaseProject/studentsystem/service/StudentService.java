package com.example.databaseProject.studentsystem.service;

import com.example.databaseProject.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}