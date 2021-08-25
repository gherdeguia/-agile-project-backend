package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByCinemaId(Integer cinema_id);
}
