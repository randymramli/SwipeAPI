package com.example.swipeapi.services;

import com.example.swipeapi.model.CreditCard;
import com.example.swipeapi.repository.CreditCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardServiceServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepo creditCardRepo;

    @Override
    public List<CreditCard> getAll() {
        return null;
    }

    public void createCreditCard(CreditCard creditCard) {
        creditCardRepo.insert(creditCard);
    }

    public void deleteCreditCard(CreditCard creditCard) {
    }
}
