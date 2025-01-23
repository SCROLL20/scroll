package com.example.registrationlogin.services;

import com.example.registrationlogin.models.User;
import com.example.registrationlogin.models.LoginUser;
import com.example.registrationlogin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User register(User newUser) {
        Optional<User> existingUser = userRepository.findByEmail(newUser.getEmail());
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }
        String hashedPassword = bCryptPasswordEncoder.encode(newUser.getPassword());
        ((User) newUser).setPassword11(hashedPassword);
        return userRepository.save(newUser);
    }

    public User login(LoginUser loginUser) {
        Optional<User> user = userRepository.findByEmail(loginUser.getEmail());
        if (user.isEmpty() || !bCryptPasswordEncoder.matches(loginUser.getPassword(), user.get().getPassword())) {
            throw new IllegalArgumentException("Invalid email or password");
        }
        return user.get();
    }
}
