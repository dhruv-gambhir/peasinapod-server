package com.example.peasinapod.controller;

import com.example.peasinapod.model.User;
import com.example.peasinapod.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/")
    public String sayHello() {
        return "Auth Controller is active!";
    }
}


