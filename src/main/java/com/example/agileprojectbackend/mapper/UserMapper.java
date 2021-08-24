package com.example.agileprojectbackend.mapper;

import com.example.agileprojectbackend.dto.UserResponse;
import com.example.agileprojectbackend.model.Users;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toResponse(Users users){
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(users, userResponse);
        return userResponse;
    }

}
