package com.mohamedfathidev.watchesrest.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private int lastName;

    public Author(String firstName, int lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getLastName() {
        return lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName=" + lastName +
                '}';
    }
}
