package com.example.greenwashing.repository;

import com.example.greenwashing.model.Marker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkerRepository extends JpaRepository<Marker, Integer> {
}
