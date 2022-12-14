package com.example.springbootwithgraphql.controller;


import com.example.springbootwithgraphql.entity.User;
import com.example.springbootwithgraphql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public User insertUser(@RequestBody User user){
       return userService.createUser(user);
    }

   @QueryMapping("allUsers")
    public List<User> getAllUsers(){
        return userService.findAllUser();
    }

    @QueryMapping("getUser")
    public User getUserById(@Argument int userId){
        return userService.getUserById(userId);
    }
}
