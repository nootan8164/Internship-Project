package com.portal.controllers;

import com.portal.models.Job;
import com.portal.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job")
@CrossOrigin
public class JobController {
    @Autowired
    private JobService service;

    @PostMapping("/post")
    public Job postJob(@RequestBody Job job) {
        return service.postJob(job);
    }

    @GetMapping("/all")
    public List<Job> allJobs() {
        return service.allJobs();
    }

    @GetMapping("/recruiter/{id}")
    public List<Job> jobsByRecruiter(@PathVariable Long id) {
        return service.jobsByRecruiter(id);
    }
}
