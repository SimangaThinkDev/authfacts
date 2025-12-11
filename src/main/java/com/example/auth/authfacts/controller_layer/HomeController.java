package com.example.auth.authfacts.controller_layer;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page";
    }

}
