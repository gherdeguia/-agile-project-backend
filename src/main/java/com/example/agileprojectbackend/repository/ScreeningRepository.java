package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends JpaRepository <Screening, Integer> {
}
