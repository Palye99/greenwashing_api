package com.example.greenwashing.controller;

import com.example.greenwashing.model.Marker;
import com.example.greenwashing.service.MapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/map")
public class MapController {

    private final MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @CrossOrigin()
    @RequestMapping(value ="/addMarker", method = RequestMethod.POST)
    public ResponseEntity<Boolean>addMarker(@RequestBody Marker marker) {
        return Optional
                .ofNullable(this.mapService.addMarker(marker))
                .map(list -> ResponseEntity.ok().body(list))          //200 OK
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
