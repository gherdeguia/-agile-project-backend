package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Integer movieId) {
        return movieRepository.findById(movieId).orElse(null);
    }
}
