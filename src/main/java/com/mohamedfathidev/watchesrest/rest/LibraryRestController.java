package com.mohamedfathidev.watchesrest.rest;

import com.mohamedfathidev.watchesrest.DAO.BookDAO;
import com.mohamedfathidev.watchesrest.entity.Author;
import com.mohamedfathidev.watchesrest.entity.Book;
import com.mohamedfathidev.watchesrest.service.AuthorService;
import com.mohamedfathidev.watchesrest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/library")
public class LibraryRestController {

    private final AuthorService authorService;
    private final BookService bookService;

    @Autowired
    public LibraryRestController(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
