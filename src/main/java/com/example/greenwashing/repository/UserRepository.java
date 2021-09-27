package com.example.greenwashing.repository;

import com.example.greenwashing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
