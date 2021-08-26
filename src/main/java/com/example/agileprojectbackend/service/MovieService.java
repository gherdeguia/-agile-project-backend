package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.exception.MovieNotFoundException;
import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllDistinctMovies() {
      return movieRepository.findAll().stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Movie::getMovieId))),
                        ArrayList::new));
    }

    public Movie getMovieById(Integer movieId) {
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new MovieNotFoundException("Movie ID not exist!"));
    }

    public List<Movie> getTrendingMovies() {
        return movieRepository.findAll(Sort.by(Sort.Direction.DESC, "criticsRating"))
                .stream()
                .filter(movie -> "showing".equalsIgnoreCase(movie.getStatus()))
                .collect(Collectors.toList());

    }

}
