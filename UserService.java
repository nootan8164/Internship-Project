package com.portal.services;

import com.portal.models.User;
import com.portal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String email, String password) {
        User u = repo.findByEmail(email);
        return (u != null && u.getPassword().equals(password)) ? u : null;
    }
}
