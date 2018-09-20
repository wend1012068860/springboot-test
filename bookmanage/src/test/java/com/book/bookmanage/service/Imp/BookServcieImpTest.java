package com.book.bookmanage.service.Imp;

import com.book.bookmanage.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServcieImpTest {
    @Resource
    private BookService bookService;


    @Test
    public void getAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    public void getOne() {
        System.out.println(bookService.getOne(3));
    }
}