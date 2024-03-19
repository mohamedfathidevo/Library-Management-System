package com.mohamedfathidev.watchesrest.service;

import com.mohamedfathidev.watchesrest.DAO.AuthorDAO;
import com.mohamedfathidev.watchesrest.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorDAO authorDAO;

    @Autowired
    public AuthorService(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public List<Author> getAllAuthors() {
        return authorDAO.getAllAuthors();
    }
}
