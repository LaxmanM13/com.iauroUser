package com.iaurouser.controller;

import com.iaurouser.entities.User;
import com.iaurouser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return this.userService.getAllUser();
    }

    @GetMapping("/users/{name}")
    public User getUser(@PathVariable("name") String name)  {
        return this.userService.getUser(name);
    }


}
