package com.example.swipeapi.services;

import com.example.swipeapi.model.Transaction;
import com.example.swipeapi.model.User;

import java.util.List;
import java.util.UUID;

public interface TransService {
    List<Transaction> getAllTransactionFromUser(String username);

    User getTransactionByID(UUID idNum);

    default void createTransaction(Transaction transaction) {}

    default void deleteTransaction(Transaction transaction) {}

    default void cancelTransaction() {}
}
