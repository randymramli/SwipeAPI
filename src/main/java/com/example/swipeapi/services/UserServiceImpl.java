package com.example.swipeapi.services;

import com.example.swipeapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.swipeapi.repository.UserRepo;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public User getUserByUsername(String username) {
       return userRepo.findByUsername(username).orElseThrow(() -> new RuntimeException(
               String.format("Cannot Find User By Name %s", username)));
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepo.findByEmail(email).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find User By Email %s", email)));
    }

    public void createUser(User user) {
        userRepo.findByUsername(user.getUsername()).ifPresentOrElse(u -> {
            System.out.println("User already exist");
        }, () -> {userRepo.insert(user);
        });
    }

    public void deleteUser(UUID id) {
        userRepo.deleteById(id);
    }

    public void updateUser(User user) {
        User savedUser = userRepo.findById(user.getIdNum()).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find User By Name %s", user.getIdNum())));
        savedUser.setUsername(user.getUsername());
        savedUser.setEmail(user.getEmail());
        savedUser.setPassword(user.getPassword());

        userRepo.save(user);
    }

    @Override
    public String save(User user) {
        return userRepo.save(user).getUsername();
    }
}
