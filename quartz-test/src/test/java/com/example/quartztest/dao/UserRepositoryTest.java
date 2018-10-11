package com.example.quartztest.dao;

import com.example.quartztest.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void save() {
        User[] users = {
                new User("1111", "1111", "宁好诗雨", "https://ws1.sinaimg.cn/large/00792MPDly1fvqeg8h4gqj308c08cq36.jpg"),
                new User("2222", "2222", "灬空海", "https://ws1.sinaimg.cn/large/00792MPDly1fvqeg8dxjvj308c08cgnc.jpg"),
                new User("3333", "3333", "黑夜孜然", "https://ws1.sinaimg.cn/large/00792MPDly1fvqeg82u1kj30bm0bk0tm.jpg"),
                new User("4444", "4444", "飞逝", "https://ws1.sinaimg.cn/large/00792MPDly1fvqeg7tpjwj30b40b43yv.jpg"),
                new User("5555", "5555", "落幕晟伤", "https://ws1.sinaimg.cn/large/00792MPDly1fvqeg7m7l5j30730730so.jpg"),
                new User("6666", "6666", "风丶无痕", "https://ws1.sinaimg.cn/large/00792MPDly1fvqeg88xixj30r20r2ab5.jpg")
        };

        for (int i = 0; i < users.length; i++) {
            userRepository.save(users[i]);
        }
    }

    @Test
    public void findByAccount() {
        System.out.println(userRepository.findByAccount("5555"));
    }
}