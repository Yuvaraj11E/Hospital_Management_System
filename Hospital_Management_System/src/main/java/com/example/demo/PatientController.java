package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController 
{	
	@Autowired
    private PatientService patientService;

    @GetMapping("/addpatient")
    public String showAddForm(Model model) {
        model.addAttribute("patient", new Patient(0, null , null, null, 0, null, null));
        return "addpatient";
    }
    @PostMapping("/save")
    public String savePatient(@ModelAttribute Patient patient, Model model) {
        patientService.savePatient(patient);
        model.addAttribute("message", "PATIENT SAVED SUCCESSFULLY");
        return "save";
    }
    @GetMapping("/patientlist")
    public String viewPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patientlist";
    }
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") Integer id) {
        patientService.deletePatientById(id);
        return "redirect:/patientlist"; // Redirect back to the list view
    }
}



