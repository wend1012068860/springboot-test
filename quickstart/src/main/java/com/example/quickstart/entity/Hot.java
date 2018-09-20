package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Hot {
    private String pic;
    private String name;
    private String like;

    public Hot() {
    }

    public Hot(String pic, String name, String like) {
        this.pic = pic;
        this.name = name;
        this.like = like;
    }
}
