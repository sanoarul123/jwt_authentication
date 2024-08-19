package com.sanoarulislam.auth_authorization.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanoarulislam.auth_authorization.entity.user;

public interface UserRepository extends JpaRepository<user, Long> {

    // Method to find a user by username
    Optional<user> findByUsername(String username);

    // Method to check if a user exists by username
    boolean existsByUsername(String username);

}
