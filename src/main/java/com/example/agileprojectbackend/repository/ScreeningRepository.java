package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository <Screening, Integer> {
    List<Screening> findByCinemaId(Integer cinema_id);
}
