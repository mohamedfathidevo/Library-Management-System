package com.mohamedfathidev.watchesrest.DAO;

import com.mohamedfathidev.watchesrest.entity.Author;
import com.mohamedfathidev.watchesrest.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO {
    EntityManager entityManager;

    @Autowired
    public BookDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Book> getAllBooks() {
        TypedQuery<Book> query = entityManager.createQuery("FROM Book", Book.class);
        return query.getResultList();
    }
}
