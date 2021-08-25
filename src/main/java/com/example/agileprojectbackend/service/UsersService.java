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

    public Users getUserProfileById(Integer userId) {
        return userRepository.getById(userId);
    }

    public List<Users> getUserByEmail(String email) {
        return userRepository.findByEmailAddress(email);
    }

    public Users saveNewUser(Users user){
        if(emailDoesNotExists(user.getEmailAddress())){
            return userRepository.save(user);
        }
        return null;
    }

    public Users updateUser(Integer id, Users userToBeUpdate){
        return userRepository.findById(id)
                .map(user -> {
                    userToBeUpdate.setFullName(user.getFullName());
                    userToBeUpdate.setPhoneNumber(user.getPhoneNumber());

                    return userRepository.save(userToBeUpdate);
                })
                .orElseThrow(null);
    }

    public List<Users> findByEmailAddress(String emailAddress){
        return userRepository.findByEmailAddress(emailAddress);
    }

    public boolean emailDoesNotExists(String emailAddress){
        return findByEmailAddress(emailAddress).size() > 0;
    }
}
