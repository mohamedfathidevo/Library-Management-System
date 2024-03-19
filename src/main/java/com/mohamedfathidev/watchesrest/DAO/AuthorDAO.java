package com.mohamedfathidev.watchesrest.DAO;

import com.mohamedfathidev.watchesrest.entity.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDAO {
    EntityManager entityManager;

    @Autowired
    public AuthorDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Author> getAllAuthors() {
        TypedQuery<Author> query = entityManager.createQuery("FROM Author", Author.class);
        return query.getResultList();
    }

}
