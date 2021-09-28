package com.example.greenwashing.service;

import com.example.greenwashing.model.User;
import com.example.greenwashing.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean register(User user) {
        this.userRepository.save(user);
        return true;
    }

    public User getUserWithEMail(String email) {
        return this.userRepository.getFirstByEmail(email);
    }
}
