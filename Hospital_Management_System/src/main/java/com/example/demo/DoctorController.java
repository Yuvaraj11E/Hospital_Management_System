package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public String showDoctors(Model model) {
        List<Doctor> doctorList = doctorService.getAllDoctors();
        System.out.println("Doctors from DB: " + doctorList);
        model.addAttribute("doctors", doctorList);
        return "doctors"; 
    }
}
