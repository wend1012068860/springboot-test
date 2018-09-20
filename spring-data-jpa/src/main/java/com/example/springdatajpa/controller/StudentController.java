package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.User;
import com.example.springdatajpa.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Resource
    private StudentService StudentService;

    @GetMapping("/all")
    public List<User> getAll(){
        return StudentService.getAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return StudentService.get(id);
    }
}
