package com.book.bookmanage.service.Imp;

import com.book.bookmanage.dao.BookRepository;
import com.book.bookmanage.entity.Book;
import com.book.bookmanage.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServcieImp implements BookService {

    @Resource
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getOne(int id) {
        return bookRepository.findById(id).get();
    }
}
