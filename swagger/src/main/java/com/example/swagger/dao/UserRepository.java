package com.example.swagger.dao;

import com.example.swagger.Entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<SysUser, Long> {

    SysUser findByAccount(String account);

    List<SysUser> findByFansBetween(Integer buttom, Integer top);

//    @Query("from SysUser u where u.nickname=:nickname")
//    SysUser findUser(@Param("nickname") String nickname);

    @Query("from SysUser u where u.nickname like %:keywords% order by u.fans desc ")
    List<SysUser> findUsersKeywords(@Param("keywords") String keywords);

}
