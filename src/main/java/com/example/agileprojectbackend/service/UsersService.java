package com.example.agileprojectbackend.service;
import com.example.agileprojectbackend.model.Users;
import com.example.agileprojectbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUserProfiles(){
        return userRepository.findAll();
    }
}
