package com.example.springdatajpa.service;

import com.example.springdatajpa.dao.StudentRepository;
import com.example.springdatajpa.entity.User;

import java.util.List;

public interface StudentService{
    User save(User user);
    List<User> getAll();
    User get(int id);
}
