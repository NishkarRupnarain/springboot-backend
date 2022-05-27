package com.Nishkar.springbootbackend.G4L_Reverside.controller;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.User;
import com.Nishkar.springbootbackend.G4L_Reverside.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }



}
