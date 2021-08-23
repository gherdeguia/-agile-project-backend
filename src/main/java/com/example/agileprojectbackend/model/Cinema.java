package com.example.agileprojectbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Movie> movies;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Screening> screenings;

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }

    public Cinema() {
    }

    public Cinema(Integer id, String name, List<Movie> movies) {
        this.id = id;
        this.name = name;
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
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

}
