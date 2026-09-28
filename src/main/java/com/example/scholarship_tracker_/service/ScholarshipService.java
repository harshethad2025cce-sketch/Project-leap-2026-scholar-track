package com.example.scholarship_tracker_.service;

import com.example.scholarship_tracker_.model.Scholarship;
import java.util.List;

public interface ScholarshipService {

    Scholarship addScholarship(Scholarship scholarship);

    List<Scholarship> viewAllScholarships();
}