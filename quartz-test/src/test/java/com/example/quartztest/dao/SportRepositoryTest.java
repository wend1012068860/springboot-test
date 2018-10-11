package com.example.quartztest.dao;

import com.example.quartztest.entity.Sport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SportRepositoryTest {
    @Resource
    private SportRepository sportRepository;

    @Test
    public void save() {
        Sport[] sports = {
                new Sport("1111", 8653),
                new Sport("2222", 12536),
                new Sport("3333", 7636),
                new Sport("4444", 11256),
                new Sport("5555", 25673),
                new Sport("6666", 9643),
        };
        for (int i = 0; i < sports.length; i++) {
            sportRepository.save(sports[i]);
        }
    }

    @Test
    public void findAll() {
        System.out.println(sportRepository.getAll());
    }

    @Test
    public void findOne() {
        System.out.println(sportRepository.findSportByAccount("2222"));
    }

}