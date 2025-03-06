package com.kulbit.spring.rest.dao;

import com.kulbit.spring.rest.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    private SessionFactory sessionFactory;

    public BookDAOImpl(@Autowired SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Book> getAllBooks() {
       Session session = sessionFactory.getCurrentSession();
       List<Book> books = session.createQuery("from Book", Book.class)
                .getResultList();
       return books;
    }

    @Override
    public Book getBookById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, id);
        return book;
    }

    @Override
    public void saveBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(book);
    }

    @Override
    public void deleteBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, id);
        if (book != null) {
            session.remove(book);
        }
    }
}
