package com.vp.user_service.controller;

import com.vp.user_service.dto.UserDto;
import com.vp.user_service.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body("Hi macbook, This is user-service ");
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<UserDto>> getUsers() {

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.getAllUsers());
    }

    @GetMapping("/getUsersWithOrders")
    public ResponseEntity<List<UserDto>> getUsersWithOrders() {

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.getAllUsersWithOrders());
    }

}
