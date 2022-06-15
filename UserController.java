package com.Nishkar.springbootbackend.G4L_Reverside.controller;

import com.Nishkar.springbootbackend.G4L_Reverside.exception.ResouceNotFoundException;
import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.User;
import com.Nishkar.springbootbackend.G4L_Reverside.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResouceNotFoundException("User ID " + id + " does not exist"));
        return ResponseEntity.ok(user);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User userDetails) {
        User updateUser = userRepository.findById(id)
                .orElseThrow(
                        () -> new ResouceNotFoundException("User ID " + id + " does not exist"));
        updateUser.setFirstName(userDetails.getFirstName());
        updateUser.setLastName(userDetails.getLastName());
        updateUser.setIdNumber(userDetails.getIdNumber());
        updateUser.setEmail(userDetails.getEmail());
        updateUser.setUsername(userDetails.getUsername());
        updateUser.setMobileNumber(userDetails.getMobileNumber());
        updateUser.setPassword(userDetails.getPassword());
        updateUser.setUpdatedAt(updateUser.getUpdatedAt());
        userRepository.save(updateUser);
        return ResponseEntity.ok(updateUser);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Integer id) {
        User deleteUser = userRepository.findById(id)
                .orElseThrow(
                        () -> new ResouceNotFoundException("User ID " + id + " does not exist"));
        userRepository.delete(deleteUser);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
    /*POST{
    "id": 17,
    "firstName": "Amber",
    "lastName": "Turd",
    "idNumber": "222456709438",
    "email": "adadsas5@gmail.com",
    "username": "sdda6dad",
    "mobileNumber": "0824589226",
    "password": "1234",
    "address": null,
    "createdAt": null,
    "updatedAt": null,
    "admin": null
}*/