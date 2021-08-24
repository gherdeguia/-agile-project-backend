package com.example.agileprojectbackend.controller;

import com.example.agileprojectbackend.dto.UserRequest;
import com.example.agileprojectbackend.dto.UserResponse;
import com.example.agileprojectbackend.mapper.UserMapper;
import com.example.agileprojectbackend.model.Users;
import com.example.agileprojectbackend.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public List<Users> getAllUserProfiles(){
        return usersService.getAllUserProfiles();
    }

    @GetMapping("/{userId}")
    public UserResponse getUserById(@PathVariable Integer userId){
        return userMapper.toResponse(usersService.getUserProfileById(userId));
    }

    @GetMapping(params = "email")
    public UserResponse getUserByEmail(@RequestParam String email){
        return userMapper.toResponse(usersService.getUserByEmail(email));
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Users addNewUser(@RequestBody UserRequest userRequest){
        return usersService.saveNewUser(UserMapper.toEntity(userRequest));
    }
}
