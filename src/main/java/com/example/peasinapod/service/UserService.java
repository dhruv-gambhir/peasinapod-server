package com.example.peasinapod.service;

import com.example.peasinapod.repository.UserRepository;




public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(String id) {
        return userRepository.getUserById(id);
    }

    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }
}
