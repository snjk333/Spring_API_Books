package com.kulbit.spring.rest.dao;

import com.kulbit.spring.rest.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getAllBooks();
    public Book getBookById(int id);
    public void saveBook(Book book);
    public void deleteBook(int id);
}
