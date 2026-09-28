package com.example.scholarship_tracker_.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scholarship")
public class Scholarship {

    @Id
    private String id;

    private String scholarshipName;
    private String provider;
    private String eligibility;
    private String deadline;
    private String amount;

    public Scholarship() {
    }

    public Scholarship(String scholarshipName, String provider,
                       String eligibility, String deadline, String amount) {
        this.scholarshipName = scholarshipName;
        this.provider = provider;
        this.eligibility = eligibility;
        this.deadline = deadline;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}