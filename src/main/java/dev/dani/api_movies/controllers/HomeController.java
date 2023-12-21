package dev.dani.api_movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// annotations
@RestController
public class HomeController {

    @GetMapping(path = "/")
    public String index() {
        
        return "Hello Springboot";
        
    }
    
}