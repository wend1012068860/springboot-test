package com.example.swagger.controller;

import com.example.swagger.Entity.SysUser;
import com.example.swagger.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<SysUser> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public SysUser getOne(@PathVariable int id){
        return userService.getOne(id);
    }

    @GetMapping("/account")
    public SysUser getUser(String account){
        return userService.findByAccount(account);
    }

    @GetMapping("/fans")
    public List<SysUser> getFans(Integer buttom, Integer top){
        return userService.findByFansBetween(buttom,top);
    }

    @GetMapping("/nickname")
    public List<SysUser> getNickname(String nickname){
        return userService.findUsersKeywords(nickname);
    }

}
