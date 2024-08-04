package com.example.docManagerSystems.auth.service;

import com.example.docManagerSystems.auth.entity.User;
import com.example.docManagerSystems.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
