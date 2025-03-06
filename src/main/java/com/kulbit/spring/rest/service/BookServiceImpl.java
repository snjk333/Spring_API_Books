package com.kulbit.spring.rest.service;

import com.kulbit.spring.rest.dao.BookDAO;
import com.kulbit.spring.rest.entity.Book;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    BookDAO bookDAO;

    public BookServiceImpl(@Autowired BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        bookDAO.deleteBook(id);
    }
}
