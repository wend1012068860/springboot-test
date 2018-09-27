package com.example.swagger.dao;

import com.example.swagger.Entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void getAll() {
        List<SysUser> users = userRepository.findAll();
        System.out.println(users);
    }

    @Test
    public void getUser() {
        SysUser user = userRepository.findById((long) 4).get();
        System.out.println(user);
    }

    @Test
    public void findByAccount() {
    }

    @Test
    public void findByFansBetween() {
    }

    @Test
    public void findUser() {
    }

    @Test
    public void findUsersKeywords() {
        List<SysUser> users = userRepository.findUsersKeywords("狗");
        System.out.println(users);
    }
}