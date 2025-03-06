package com.kulbit.spring.rest.controller;

import com.kulbit.spring.rest.entity.Book;
import com.kulbit.spring.rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookContoller {

    BookService bookService;

    public BookContoller(@Autowired BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        Book book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    @PutMapping("/books")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Book bookToUpdate = bookService.getBookById(book.getId());
        if (bookToUpdate == null) {
            return ResponseEntity.notFound().build();
        }
        bookService.saveBook(book);

        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        Book bookToDelete = bookService.getBookById(id);
        if (bookToDelete == null) {
            return ResponseEntity.notFound().build();
        }
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
