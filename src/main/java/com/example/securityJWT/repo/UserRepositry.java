package com.example.securityJWT.repo;

import com.example.securityJWT.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositry extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
