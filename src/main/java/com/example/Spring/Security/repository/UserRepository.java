package com.example.Spring.Security.repository;

import java.util.Optional;

import com.example.Spring.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String username);
}
