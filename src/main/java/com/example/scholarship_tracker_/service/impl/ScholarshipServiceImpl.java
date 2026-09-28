package com.example.scholarship_tracker_.service.impl;

import com.example.scholarship_tracker_.model.Scholarship;
import com.example.scholarship_tracker_.repository.ScholarshipRepository;
import com.example.scholarship_tracker_.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScholarshipServiceImpl implements ScholarshipService {

    @Autowired
    private ScholarshipRepository repo;

    // Save scholarship details
    @Override
    public Scholarship addScholarship(Scholarship scholarship) {
        return repo.save(scholarship);
    }

    // Display all scholarships
    @Override
    public List<Scholarship> viewAllScholarships() {
        return repo.findAll();
    }
}