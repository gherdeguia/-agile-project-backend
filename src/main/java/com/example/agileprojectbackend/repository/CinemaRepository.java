package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
    Cinema findByName(String cinemaName);
}
