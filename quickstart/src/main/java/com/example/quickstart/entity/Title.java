package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Title {
    private String pic;
    private String name;
    private String like;

    public Title(){

    }

    public Title(String pic, String name, String like) {
        this.pic = pic;
        this.name = name;
        this.like = like;
    }
}
