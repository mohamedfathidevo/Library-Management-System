package com.mohamedfathidev.library.exception;

public class BookAlreadyBorrowedException extends RuntimeException{
    public BookAlreadyBorrowedException(String message) {
        super(message);
    }
}
