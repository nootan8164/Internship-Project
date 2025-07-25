package com.portal.services;

import com.portal.models.Job;
import com.portal.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository repo;

    public Job postJob(Job job) {
        return repo.save(job);
    }

    public List<Job> allJobs() {
        return repo.findAll();
    }

    public List<Job> jobsByRecruiter(Long recruiterId) {
        return repo.findByRecruiterId(recruiterId);
    }
}
