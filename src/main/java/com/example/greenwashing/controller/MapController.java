package com.example.greenwashing.controller;

import com.example.greenwashing.service.MapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/map")
public class MapController {

    public MapController(MapService mapService) {
    }

    @CrossOrigin()
    @RequestMapping(value ="/addMarker")
    public ResponseEntity<Boolean>addMarker() {
        return Optional
                .ofNullable(true)
                .map(list -> ResponseEntity.ok().body(list))          //200 OK
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
