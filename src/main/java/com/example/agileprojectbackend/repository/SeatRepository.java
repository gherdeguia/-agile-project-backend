package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository <Seat, Integer> {
//    List<Seat> findByScreeningId(Integer screening_id);
}
