package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demo {
    @GetMapping("/home")
    public String home() {
        return "Hospital_Management_System"; 
    }
}
