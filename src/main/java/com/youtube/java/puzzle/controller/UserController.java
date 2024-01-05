package com.youtube.java.puzzle.controller;

import com.youtube.java.puzzle.dto.UserDTO;
import com.youtube.java.puzzle.model.User;
import com.youtube.java.puzzle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.saveUser(userDTO));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> getUsers() {
        return ResponseEntity.ok(userService.getUserList());
    }
}
