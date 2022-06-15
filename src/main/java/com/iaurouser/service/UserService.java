package com.iaurouser.service;

import com.iaurouser.entities.User;

import java.util.List;

public interface  UserService {

    List<User> getAllUser();


    User getUser(String name);
}
