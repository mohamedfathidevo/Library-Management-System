package com.mohamedfathidev.library.repository;

import com.mohamedfathidev.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
