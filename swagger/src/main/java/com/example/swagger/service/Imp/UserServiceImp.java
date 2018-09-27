package com.example.swagger.service.Imp;

import com.example.swagger.Entity.SysUser;
import com.example.swagger.dao.UserRepository;
import com.example.swagger.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<SysUser> getAll() {
        List<SysUser> users = userRepository.findAll();
        return users;
    }

    @Override
    public SysUser getOne(int id) {
        SysUser user = userRepository.findById((long) id).get();
        return user;
    }

    @Override
    public SysUser findByAccount(String account) {
        SysUser user = userRepository.findByAccount(account);
        return user;
    }

    @Override
    public List<SysUser> findByFansBetween(Integer buttom, Integer top) {
        List<SysUser> users = userRepository.findByFansBetween(buttom,top);
        return users;
    }

    @Override
    public List<SysUser> findUsersKeywords(String keywords) {
        List<SysUser>  users = userRepository.findUsersKeywords(keywords);
        return users;
    }
}
