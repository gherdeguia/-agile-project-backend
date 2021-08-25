package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findByEmailAddress(String emailAddress);
}
