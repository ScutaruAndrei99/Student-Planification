package com.andrei.studentPlanification.controller;

import com.andrei.studentPlanification.dto.UserDto;
import com.andrei.studentPlanification.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {

        userService.createUserAccount(userDto);
        return ResponseEntity.ok("User registered successfully");
    }
}
