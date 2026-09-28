package com.example.scholarship_tracker_.controller;

import com.example.scholarship_tracker.model.Scholarship;
import com.example.scholarship_tracker.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scholarship")
@CrossOrigin("*")
public class ScholarshipController {

    @Autowired
    private ScholarshipService service;

    // Add scholarship
    @PostMapping("/add")
    public Scholarship addScholarship(@RequestBody Scholarship scholarship) {
        return service.addScholarship(scholarship);
    }

    // View all scholarships
    @GetMapping("/all")
    public List<Scholarship> getAllScholarships() {
        return service.viewAllScholarships();
    }
}