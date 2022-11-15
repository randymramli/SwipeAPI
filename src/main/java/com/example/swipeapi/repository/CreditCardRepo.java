package com.example.swipeapi.repository;

import com.example.swipeapi.model.CreditCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CreditCardRepo extends MongoRepository<CreditCard, String> {
}
