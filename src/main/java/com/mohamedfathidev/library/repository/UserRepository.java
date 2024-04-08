package com.mohamedfathidev.library.repository;

import com.mohamedfathidev.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
