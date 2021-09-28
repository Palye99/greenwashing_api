package com.example.greenwashing.repository;

import com.example.greenwashing.model.Marker;
import com.example.greenwashing.model.StatutEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkerRepository extends JpaRepository<Marker, Integer> {

    public List<Marker> getAllByStatutEnumNot(StatutEnum statutEnum);
}
