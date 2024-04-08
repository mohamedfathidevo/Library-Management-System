package com.mohamedfathidev.library.service;

import com.mohamedfathidev.library.entity.Book;
import com.mohamedfathidev.library.entity.User;
import com.mohamedfathidev.library.exception.BookAlreadyBorrowedException;
import com.mohamedfathidev.library.exception.BookAlreadyNotBorrowedException;
import com.mohamedfathidev.library.exception.BookNotFoundException;
import com.mohamedfathidev.library.exception.UserNotFoundException;
import com.mohamedfathidev.library.repository.BookRepository;
import com.mohamedfathidev.library.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException("Book not fount with the given ID."));
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        if (findById(id) != null)
            bookRepository.deleteById(id);
        else
            throw new BookNotFoundException("Book not fount with the given ID.");
    }

    public Book borrowBook(Long bookId, Long userId) {
        Book book = findById(bookId);
        User user = userRepository.findById(userId).orElse(null);
        if (book == null)
            throw new BookNotFoundException("Book not fount with the given ID.");
        if (book.isBorrowed())
            throw new BookAlreadyBorrowedException("Book is already borrowed by this given id.");
        if (user == null)
            throw new UserNotFoundException("User not fount with the given ID.");
        book.setBorrowedBy(user);
        book.setBorrowed(true);
        return save(book);
    }

    public Book returnBook(Long bookId) {
        Book book = findById(bookId);
        if (book == null)
            throw new BookNotFoundException("Book not fount with the given ID.");
        if (!book.isBorrowed())
            throw new BookAlreadyNotBorrowedException("Book is already not borrowed by this given id.");
        book.setBorrowedBy(null);
        book.setBorrowed(false);
        return save(book);
    }

}
