package com.mohamedfathidev.library.exception;

public class BookAlreadyNotBorrowedException extends RuntimeException{
    public BookAlreadyNotBorrowedException(String message) {
        super(message);
    }
}
