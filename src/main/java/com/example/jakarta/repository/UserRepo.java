package com.example.jakarta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jakarta.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
