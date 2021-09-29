package com.example.greenwashing.controller;

import com.example.greenwashing.model.Marker;
import com.example.greenwashing.service.MapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/map")
public class MapController {

    private final MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @PostMapping(value ="/saveMarker")
    public ResponseEntity<Boolean>updateMarker(@RequestBody Marker marker) {
        return Optional
                .ofNullable(this.mapService.saveMarker(marker))
                .map(list -> ResponseEntity.ok().body(list))          //200 OK
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping(value ="/allMarker")
    public ResponseEntity<List<Marker>>allMarker() {
        return Optional
                .ofNullable(this.mapService.allMarker())
                .map(list -> ResponseEntity.ok().body(list))          //200 OK
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
