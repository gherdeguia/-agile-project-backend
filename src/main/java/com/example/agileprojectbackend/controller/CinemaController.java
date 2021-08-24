package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.dto.CinemaResponse;
import com.example.agileprojectbackend.mapper.CinemaMapper;
import com.example.agileprojectbackend.model.Cinema;
import com.example.agileprojectbackend.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    @Autowired
    CinemaService cinemaService;
    @Autowired
    CinemaMapper cinemaMapper;

    @GetMapping
    public List<Cinema> getAllEmployeeInfo() {
        return cinemaService.getAllCinema();
    }

    @GetMapping(params = "cinemaName")
    public CinemaResponse findCinemaName(@RequestParam String cinemaName) {
        return cinemaMapper.toResponse(cinemaService.getAllPosterByCinemaName(cinemaName));
    }
}
