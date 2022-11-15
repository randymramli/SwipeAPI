package com.example.swipeapi.repository;

import com.example.swipeapi.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TransactionRepo extends MongoRepository<Transaction, UUID> {

    @Query("{'username': ?0}")
    Optional<List<Transaction>> findAllByUsername(String username);


}
