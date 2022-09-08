package com.example.Spring.Security.repository;

import java.util.Optional;

import com.example.Spring.Security.model.Attempts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttemptsRepository extends JpaRepository<Attempts, Integer> {
    Optional<Attempts> findAttemptsByUsername(String username);
}
