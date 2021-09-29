package com.example.greenwashing.controller;


import com.example.greenwashing.model.User;
import com.example.greenwashing.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value ="/register")
    public ResponseEntity<Boolean> addUser(@RequestBody User user) {
        return Optional
                .ofNullable(this.userService.register(user))
                .map(list -> ResponseEntity.ok().body(list))          //200 OK
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping(value ="/getUserWithEmail/{email}")
    public ResponseEntity<User> getUserWithEmail(@PathVariable String email) {
        return Optional
                .ofNullable(this.userService.getUserWithEMail(email))
                .map(list -> ResponseEntity.ok().body(list))          //200 OK
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
