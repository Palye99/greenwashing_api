package com.example.greenwashing.service;

import com.example.greenwashing.model.Marker;
import com.example.greenwashing.model.StatutEnum;
import com.example.greenwashing.repository.MarkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {

    private final MarkerRepository markerRepository;

    public MapService(MarkerRepository markerRepository) {
        this.markerRepository = markerRepository;
    }

    public boolean addMarker(Marker marker) {
        this.markerRepository.save(marker);
        return true;
    }

    public List<Marker> allMarker() {
        return this.markerRepository.getAllByStatutEnumNot(StatutEnum.DONE);
    }
}
