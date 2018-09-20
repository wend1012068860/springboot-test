package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Avatar {
    private String ava;
    private String name;

    public Avatar() {
    }

    public Avatar(String ava, String name) {
        this.ava = ava;
        this.name = name;
    }
}
