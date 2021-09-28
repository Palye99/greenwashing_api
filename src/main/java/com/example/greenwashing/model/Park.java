package com.example.greenwashing.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "park")
public class Park {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    private String lat;

    private String lng;

    @OneToMany(mappedBy = "user")
    private Set<Marker> markers = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Set<Marker> getMarkers() {
        return markers;
    }

    public void setMarkers(Set<Marker> markers) {
        this.markers = markers;
    }
}
