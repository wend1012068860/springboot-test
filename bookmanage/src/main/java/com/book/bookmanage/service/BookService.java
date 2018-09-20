package com.book.bookmanage.service;

import com.book.bookmanage.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book getOne(int id);
}
