package com.iauroUser.service;

import com.iauroUser.entities.User;

import java.util.List;

public interface  UserService {

    List<User> getAllUser();


    User getUser(String id) throws Exception;
}
