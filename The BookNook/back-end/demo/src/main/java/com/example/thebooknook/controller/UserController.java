package com.example.thebooknook.controller;



import com.example.thebooknook.model.User;
import com.example.thebooknook.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // Allow CORS from your fronted URL
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/login")
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        // Perform login authentication if needed (e.g., check credentials)
        // ...

        // Save the user details in the database
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
