package com.app.rentify.controller;

import com.app.rentify.model.User;
import com.app.rentify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentify")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //user registration
    @CrossOrigin("*")
    @PostMapping(path = "/registerUser")
    public String userRegistration(@RequestBody User user){

        return userService.userRegister(user);
    }
}
