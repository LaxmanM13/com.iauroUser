package com.iaurouser.service;

import com.iaurouser.entities.User;
import com.iaurouser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

     private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

     @Override
     public User getUser(String name) {
         return userRepository.findByName(name);
    }



    }





