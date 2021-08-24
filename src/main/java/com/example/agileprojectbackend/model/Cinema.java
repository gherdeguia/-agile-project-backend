package com.example.agileprojectbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cinemaId")
    private List<Movie> movies;
    public Cinema(Integer id, String name, List<Movie> movies, List<Screening> screeningList) {
        this.id = id;
        this.name = name;
        this.movies = movies;
    }
    public Cinema() {
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

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
