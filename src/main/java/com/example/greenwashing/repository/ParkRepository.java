package com.example.greenwashing.repository;

import com.example.greenwashing.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkRepository extends JpaRepository<Park, Integer> {
}
