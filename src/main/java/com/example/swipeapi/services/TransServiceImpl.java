package com.example.swipeapi.services;

import com.example.swipeapi.model.CreditCard;
import com.example.swipeapi.model.Transaction;
import com.example.swipeapi.model.User;
import com.example.swipeapi.repository.CreditCardRepo;
import com.example.swipeapi.repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransServiceImpl implements TransService{

    @Autowired
    private TransactionRepo transactionRepo;


    @Override
    public List<Transaction> getAllTransactionFromUser(String username) {
        return transactionRepo.findAllByUsername(username).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Transaction By %s", username)));
    }

    @Override
    public User getTransactionByID(UUID idNum) {
        return null;
    }

    @Override
    public void createTransaction(Transaction transaction) {
        transactionRepo.insert(transaction);
    }

    @Override
    public void deleteTransaction(Transaction transaction) {
    }

    @Override
    public void cancelTransaction() {
    }
}
