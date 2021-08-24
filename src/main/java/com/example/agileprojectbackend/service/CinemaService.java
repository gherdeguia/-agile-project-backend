package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.repository.CinemaRepository;
import com.example.agileprojectbackend.model.Cinema;
import com.example.agileprojectbackend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}