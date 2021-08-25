package com.example.agileprojectbackend.service;

import com.example.agileprojectbackend.model.Screening;
import com.example.agileprojectbackend.model.Seat;
import com.example.agileprojectbackend.repository.ScreeningRepository;
import com.example.agileprojectbackend.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {
    @Autowired
    private ScreeningRepository screeningRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<Screening> getAllScreeningService() {
        return screeningRepository.findAll();
    }

    public Screening getScreeningById (Integer screening_id){
        return screeningRepository.findById(screening_id).orElseThrow(null);
    }

//    public List<Seat> getSeatByScreeningID (Integer screening_id){
//        return seatRepository.findByScreeningId(screening_id);
//    }
}
