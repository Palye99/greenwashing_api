package com.example.greenwashing.model;

import javax.persistence.*;

@Entity
@Table(name = "marker")
public class Marker {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String description;

    private String lat;

    private String lng;

    private StatutEnum statutEnum;

    @OneToOne(mappedBy = "marker", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Image image;

    @ManyToOne
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return description;
    }

    public void setDesciption(String description) {
        this.description = description;
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
