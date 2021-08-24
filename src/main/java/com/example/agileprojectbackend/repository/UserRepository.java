package com.example.agileprojectbackend.repository;

import com.example.agileprojectbackend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
