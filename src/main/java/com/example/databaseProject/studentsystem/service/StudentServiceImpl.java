package com.example.databaseProject.studentsystem.service;

import com.example.databaseProject.studentsystem.model.Student;
import com.example.databaseProject.studentsystem.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository StudentRepository){
        this.studentRepository =StudentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}