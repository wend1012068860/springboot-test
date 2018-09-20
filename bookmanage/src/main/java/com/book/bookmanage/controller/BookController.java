package com.book.bookmanage.controller;

import com.book.bookmanage.entity.Book;
import com.book.bookmanage.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "book")
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/all")
    public String getBookList(ModelMap map) {
        map.addAttribute("bookList",bookService.getAll());
        return "bookList";
    }

    /**
     * 获取 Book
     * 处理 "/book/{id}" 的 GET 请求
     */
    @GetMapping(value = "/{id}")
    public String getBook(@PathVariable Integer id,ModelMap map) {
        bookService.getOne(id);
        map.addAttribute("book", bookService.getOne(id));
        return "bookDetail";
    }
}
