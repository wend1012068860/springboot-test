package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<User, Integer> {

}
