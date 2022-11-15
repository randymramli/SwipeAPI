package com.example.swipeapi.repository;

import com.example.swipeapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends MongoRepository<User, UUID> {

    @Query("{'username': ?0}")
    Optional<User> findByUsername(String username);

    @Query("{'email': ?0}")
    Optional<User> findByEmail(String email);
}
