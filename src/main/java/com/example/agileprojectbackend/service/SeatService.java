package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.model.Seat;
import com.example.agileprojectbackend.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getAllSeats(){
        return seatRepository.findAll();
    }

//    public List<Seat> getAllSeatsByScreeningID(Integer screening_id){
//        return seatRepository.findByScreeningId(screening_id);
//    }
}
