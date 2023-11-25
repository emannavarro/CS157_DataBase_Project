package com.example.databaseProject.studentsystem.repository;

import com.example.databaseProject.studentsystem.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}