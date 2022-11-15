package com.example.swipeapi.services;

import com.example.swipeapi.model.CreditCard;

import java.util.List;

public interface CreditCardService {
    List<com.example.swipeapi.model.CreditCard> getAll();

    default void createCreditCard(CreditCard creditCard) {}

    default void deleteCreditCard(CreditCard creditCard) {}

}
