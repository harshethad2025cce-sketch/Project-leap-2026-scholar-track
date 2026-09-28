package com.example.scholarship_tracker_.repository;
import com.example.scholarship_tracker.model.Scholarship;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScholarshipRepository extends MongoRepository<Scholarship, String> {
}
