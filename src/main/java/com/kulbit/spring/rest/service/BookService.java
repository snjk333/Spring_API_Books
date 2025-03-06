package com.kulbit.spring.rest.service;


import com.kulbit.spring.rest.entity.Book;
import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(int id);
    public void saveBook(Book book);
    public void deleteBook(int id);
}
