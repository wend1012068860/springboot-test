package com.example.springdatajpa.service.Imp;

import com.example.springdatajpa.dao.StudentRepository;
import com.example.springdatajpa.entity.User;
import com.example.springdatajpa.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Resource
    private StudentRepository studentRepository;

    @Override
    public User save(User user) {
        return studentRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public User get(int id) {
        return studentRepository.findById(id).get();
    }
}
