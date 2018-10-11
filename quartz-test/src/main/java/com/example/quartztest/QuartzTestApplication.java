package com.example.quartztest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuartzTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzTestApplication.class, args);
    }
}
