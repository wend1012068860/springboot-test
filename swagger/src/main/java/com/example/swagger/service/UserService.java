package com.example.swagger.service;


import com.example.swagger.Entity.SysUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {

    List<SysUser> getAll();

    SysUser getOne(int id);

    SysUser findByAccount(String account);

    List<SysUser> findByFansBetween(Integer buttom, Integer top);

    @Query("from SysUser u where u.nickname like %:keywords% order by u.fans desc ")
    List<SysUser> findUsersKeywords(@Param("keywords") String keywords);

}
