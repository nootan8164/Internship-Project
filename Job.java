package com.portal.models;

import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String company;
    private String location;
    private String type; // Internship or Job

    @ManyToOne
    private User recruiter;

    // Getters & Setters
}
