package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.UserRequest;
import com.example.agileprojectbackend.dto.UserResponse;
import com.example.agileprojectbackend.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

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

}
