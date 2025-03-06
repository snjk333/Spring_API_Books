package com.kulbit.spring.rest.controller;

import com.kulbit.spring.rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookContoller {

    BookService bookService;

    public BookContoller(@Autowired BookService bookService) {
        this.bookService = bookService;
    }
}
