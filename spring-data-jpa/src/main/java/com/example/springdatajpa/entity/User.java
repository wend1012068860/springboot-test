package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 1.用Entity标注本类是一个可持久化类
 * 2.用@Id注解指定主键
 * 3.用@GeneratedValue注解标注主键的策略
 */

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String userAvatar;

}
