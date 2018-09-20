package com.book.bookmanage.dao;

import com.book.bookmanage.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
