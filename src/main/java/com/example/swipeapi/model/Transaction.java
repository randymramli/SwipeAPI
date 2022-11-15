package com.example.swipeapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Data
@Document(collection = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue
    private UUID transactionID = UUID.randomUUID();
    private String username;
    private CreditCard creditCard;
    private Double amount;
    private LocalDate date;
//    private PaymentType paymentType;

    public Transaction(String username, CreditCard creditCard, Double amount,
                       LocalDate date) {
        this.username = username;
        this.creditCard = creditCard;
        this.amount = amount;
        this.date = date;
    }

    public Transaction() {
        username = null;
        creditCard = new CreditCard();
        amount = 0.0;
        date = null;

    }
}
