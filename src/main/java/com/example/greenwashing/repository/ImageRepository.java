package com.example.greenwashing.repository;

import com.example.greenwashing.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
