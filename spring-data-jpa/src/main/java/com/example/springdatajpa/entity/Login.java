package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Login {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String password;
}
