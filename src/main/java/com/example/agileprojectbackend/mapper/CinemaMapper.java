package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.CinemaResponse;
import com.example.agileprojectbackend.model.Cinema;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CinemaMapper {
    public CinemaResponse toResponse(Cinema cinema){

        CinemaResponse cinemaResponse = new CinemaResponse();

        BeanUtils.copyProperties(cinema, cinemaResponse);

        cinemaResponse.setMovies(cinema.getMovies());
        cinemaResponse.setScreenings(cinema.getScreenings());

        return cinemaResponse;
    }
}
