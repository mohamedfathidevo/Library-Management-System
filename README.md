## Library Management System API Documentation

**Introduction**

This robust API manages users, books, Borrowing, and Returning functionalities within a well-organized library system. It leverages Spring Boot for a streamlined development experience.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Features](#features)
- [Dependencies](#dependencies)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Contributing](#contributing)

## Prerequisites

- Java Development Kit (JDK) 11+
- MySQL Database Server

## Features

- Create a new User
- Fetch all Users
- Add new Book
- Fetch all Books
- Fetch specific Book
- Delete a Book
- Borrow a Book
- Return a Book

## Dependencies

This project uses the following dependencies:

- [Spring Web](https://spring.io/projects/spring-framework): For building web applications.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): For working with databases using Java Persistence API.
- [MySQL Driver](https://dev.mysql.com/downloads/connector/j/): JDBC driver for MySQL.
- [Lombok](https://projectlombok.org/): For reducing boilerplate code in Java classes.
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-devtools): For developer productivity features.

## Setup
1. **Clone the repository:**
   - `git clone https://github.com/mohamedfathidev/library-management-system.git`
2. **Configure MySQL Database:**
   - Install MySQL if not already installed.
   - Create a new database for the application.
   - Update the database settings in `application.properties` file.
3. **Build and Run:**
   - `mvn spring-boot:run`

## API Endpoints
- **Create a new User**: `POST /v1/api/user`
- **Fetch all Users**: `GET /v1/api/user`
- **Add a new Book**: `POST /v1/api/book`
- **Fetch all Books**: `GET /v1/api/book`
- **Fetch specific Book**: `GET /v1/api/book/{bookId}`
- **Delete a Book**: `DELETE /v1/api/book/{bookId}`
- **Borrow a Book**: `POST /v1/api/book/{bookId}/borrow`
- **Return a Book**: `POST /v1/api/book/{bookId}/return`


## Usage

You can use any REST client (e.g., cURL, Postman) to interact with the API endpoints mentioned above.

## Contributing

Contributions are welcome! Feel free to submit pull requests or open issues.
