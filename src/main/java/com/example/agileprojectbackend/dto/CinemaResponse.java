package com.example.agileprojectbackend.dto;

import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.model.Screening;

import java.util.List;

public class CinemaResponse {
    private Integer id;
    private String name;
    private List<Movie> movies;
    private List<Screening> screenings;

    public CinemaResponse(Integer id, String name, List<Movie> movies, List<Screening> screenings) {
        this.id = id;
        this.name = name;
        this.movies = movies;
        this.screenings = screenings;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public CinemaResponse() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}
