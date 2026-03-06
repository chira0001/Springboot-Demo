package com.demo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restuarent")
public class Restuarent {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String location;
    private Double rating;
    private String cuisine;

    public Restuarent() {
    }

    public Restuarent(Integer id, String name, String location, Double rating, String cuisine) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.cuisine = cuisine;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
