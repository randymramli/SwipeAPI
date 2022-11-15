package com.example.swipeapi.controller;

import com.example.swipeapi.model.Transaction;
import com.example.swipeapi.services.CreditCardService;
import com.example.swipeapi.services.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
public class TransController {

    @Autowired
    private TransService transService;
    private CreditCardService creditService;

    public TransController(TransService transService, CreditCardService creditCardService) {
        this.transService = transService;
        this.creditService = creditCardService;
    }

    @PostMapping
    public ResponseEntity createTransaction(@RequestBody Transaction transaction) {
        creditService.createCreditCard(transaction.getCreditCard());
        transService.createTransaction(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{username}")
    public ResponseEntity<List<Transaction>> getAllTransactionFromUser(@RequestBody String username){
        return ResponseEntity.ok(transService.getAllTransactionFromUser(username));
    }

    @GetMapping
    public String hello() {
        return "hello";
    }
}
