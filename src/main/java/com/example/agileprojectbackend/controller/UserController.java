package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.mapper.UserMapper;
import com.example.agileprojectbackend.model.Users;
import com.example.agileprojectbackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UsersService usersService;

    @Autowired
    UserMapper userMapper;

    @GetMapping
    public List<Users> getAllUserProfiles(){
        return usersService.getAllUserProfiles();
    }

}
