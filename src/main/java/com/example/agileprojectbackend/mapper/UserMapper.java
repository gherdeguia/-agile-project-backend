package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.UserRequest;
import com.example.agileprojectbackend.dto.UserResponse;
import com.example.agileprojectbackend.model.Users;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public static Users toEntity(UserRequest userRequest) {
        Users user = new Users();
        BeanUtils.copyProperties(userRequest, user);
        return user;
    }

    public UserResponse toResponse(Users users){
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(users, userResponse);
        return userResponse;
    }

    public List<UserResponse> toResponse(List<Users> users){
        return users.stream().map(this::toResponse).collect(Collectors.toList());
    }

}
