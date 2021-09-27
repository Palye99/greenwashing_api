package com.example.greenwashing.model;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    @Lob
    byte[] content;

    @OneToOne(fetch = FetchType.LAZY)
    private Marker marker;

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

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }
}
