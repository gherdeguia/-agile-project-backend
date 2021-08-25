package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.model.Screening;
import com.example.agileprojectbackend.model.Seat;
import com.example.agileprojectbackend.service.ScreeningService;
import com.example.agileprojectbackend.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {
    @Autowired
    private ScreeningService screeningService;

    @Autowired
    private SeatService seatService;

    @GetMapping
    public List<Screening> getAllScreenings(){
        return screeningService.getAllScreeningService();
    }

    @GetMapping("/{screening_id}")
    public Screening getScreeningsById(@PathVariable Integer screening_id){
        return screeningService.getScreeningById(screening_id);
    }
//    @GetMapping("/seats/{screening_id}")
//    public List<Seat> getSeatByScreeningID(Integer screening_id){
//        return screeningService.getSeatByScreeningID(screening_id);
//    }

    ///screenings/{cinemaId}/{movieName}
    @GetMapping("/{cinemaID}/{movieName}")
    public List<Screening> getScreeningsById(@PathVariable Integer cinemaID, @PathVariable String movieName){
        return screeningService.getScreeningListByCinemaAndMovieName(cinemaID, movieName);
//        return screeningService.getScreeningById(screening_id);
//        return null;
    }

}
