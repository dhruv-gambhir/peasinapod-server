package com.example.peasinapod.repository;

import com.example.peasinapod.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Integer id);
    boolean existsById(Integer id);
    void deleteById(Integer id);
}

