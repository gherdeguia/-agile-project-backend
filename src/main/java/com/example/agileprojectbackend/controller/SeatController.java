package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.model.Seat;
import com.example.agileprojectbackend.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @GetMapping
    public List<Seat> getAllSeats(){
        return seatService.getAllSeats();
    }




}
