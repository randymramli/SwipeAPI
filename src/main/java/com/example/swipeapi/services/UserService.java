package com.example.swipeapi.services;

import com.example.swipeapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUser();

    User getUserByUsername(String name);
    User getUserByEmail(String email);
    String save(User user);

    default void createUser(User user) {}

    default void deleteUser(UUID idNum) {}

    default void updateUser(User user) {}
}
