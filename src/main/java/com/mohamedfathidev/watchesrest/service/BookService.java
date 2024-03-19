package com.mohamedfathidev.watchesrest.service;

import com.mohamedfathidev.watchesrest.DAO.BookDAO;
import com.mohamedfathidev.watchesrest.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookDAO bookDAO;

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
}
