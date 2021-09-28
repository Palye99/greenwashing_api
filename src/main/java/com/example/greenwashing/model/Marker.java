package com.example.greenwashing.model;

import javax.persistence.*;
import java.time.LocalDate;

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

    private TypeEnum typeEnum;

    private LocalDate dateCreation;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatutEnum getStatutEnum() {
        return statutEnum;
    }

    public void setStatutEnum(StatutEnum statutEnum) {
        this.statutEnum = statutEnum;
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
}
