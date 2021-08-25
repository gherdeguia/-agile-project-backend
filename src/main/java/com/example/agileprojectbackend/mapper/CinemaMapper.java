package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.CinemaResponse;
import com.example.agileprojectbackend.dto.PaymentRequest;
import com.example.agileprojectbackend.model.Cinema;
import com.example.agileprojectbackend.model.Payment;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CinemaMapper {

    public CinemaResponse toResponse(Cinema cinema){
        CinemaResponse cinemaResponse = new CinemaResponse();
        cinemaResponse.setMovies(cinema.getMovies());
        cinemaResponse.setName(cinema.getName());
        cinemaResponse.setId(cinema.getId());
        return cinemaResponse;
    }
}
