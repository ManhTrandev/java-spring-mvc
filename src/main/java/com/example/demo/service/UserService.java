package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUser(){
        return this.userRepository.findAll();
    }
    public List<User> getAllUserByEmail(String email){
        return this.userRepository.findByEmail(email);
    }
    public User handleSaveUser(User user){
        User user1 = this.userRepository.save(user);
        System.out.println(user1);
return user1;
    }
    public User getUserById(long id){
return this.userRepository.findById(id);
    }
}

