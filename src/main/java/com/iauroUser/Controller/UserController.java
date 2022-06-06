package com.iauroUser.Controller;

import com.iauroUser.entities.User;
import com.iauroUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return this.userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") int id)
    {
        return this.userService.getUser(id);
    }


}
