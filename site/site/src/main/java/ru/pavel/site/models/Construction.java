package ru.pavel.site.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Construction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String yes;
    private String location;
    private Integer square;

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYes() {
        return yes;
    }

    public void setYes(String yes) {
        this.yes = yes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Construction() {}

    public Construction(String location, String yes,  Integer square) {
        this.yes = yes;
        this.location = location;
        this.square = square;
    }
}
