package com.example.databaseProject.studentsystem.repository;

import com.example.databaseProject.studentsystem.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM USER WHERE u.emailAddress = ?1")
    Optional<User> findUserByEmail(String email);

}