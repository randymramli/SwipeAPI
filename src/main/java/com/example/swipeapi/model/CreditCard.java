package com.example.swipeapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Document(collection = "Credit_Card")
public class CreditCard {
    private String name;
    @Id
    private String cardNumber;
    private LocalDate date;
    private Integer securityCode;

    public CreditCard(String name, String cardNumber, LocalDate date, Integer securityCode) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.date = date;
        this.securityCode = securityCode;
    }

    public CreditCard() {
        name = "";
        cardNumber = "";
        date = null;
        securityCode = 0;
    }

}
