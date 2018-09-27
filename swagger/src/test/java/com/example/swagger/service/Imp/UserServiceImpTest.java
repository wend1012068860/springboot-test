package com.example.swagger.service.Imp;

import com.example.swagger.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImpTest {
    @Resource
    private UserService userService;

    @Test
    public void getAll() {
        System.out.println(userService.getAll());
    }

    @Test
    public void getOne() {
        System.out.println(userService.getOne(6));
    }

    @Test
    public void findByAccount() {
        System.out.println(userService.findByAccount("4444"));
    }

    @Test
    public void findByFansBetween() {
        System.out.println(userService.findByFansBetween(500,1000));
    }

    @Test
    public void findUsersKeywords() {
        System.out.println(userService.findUsersKeywords("阿"));
    }
}