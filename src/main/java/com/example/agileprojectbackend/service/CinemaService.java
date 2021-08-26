package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.model.Movie;
import com.example.agileprojectbackend.model.Screening;
import com.example.agileprojectbackend.repository.CinemaRepository;
import com.example.agileprojectbackend.model.Cinema;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    public List<Cinema> getAllCinema(){
        return cinemaRepository.findAll();
    }

    public Cinema getAllPosterByCinemaName(String cinemaName) {
        Cinema cinema = cinemaRepository.findByName(cinemaName);
        System.out.println("get movie id : "+ cinema.getId());
        return cinema;
    }

    public List<Screening> getAllScreening(Integer id){
        Cinema cinema1 = cinemaRepository.findById(id).orElse(null);
        System.out.println("cinema id  "+cinema1.getId());

        Movie movie1 = movieRepository.findById(cinema1.getMovies().get(0).getId()).orElse(null);
        System.out.println("movie name "+ movie1.getName());
        return null;

    }

    public List<Movie> getMovieByGenreInChosenCinema(String cinemaName, String genre){
        return getAllPosterByCinemaName(cinemaName).getMovies()
                .stream()
                .filter(movie -> getMovieGenres(movie).contains(genre))
                .collect(Collectors.toList());
    }

    public List<String> getMovieGenres(Movie movie){
        return  Arrays.asList(movie.getGenre().split("\\s+"));
    }
}
