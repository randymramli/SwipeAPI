package com.example.swipeapi.model;

import java.util.ArrayList;
import java.util.List;


enum AccountType {
    Admin("ADMIN"),
    Merchant("MERCHANT");

    private final String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (AccountType accountType : AccountType.values()) {
            values.add(accountType.getValue());
        }
        return values;
    }

    public static AccountType parse(String value) {
        switch (value) {
            case "ADMIN":
                return AccountType.Admin;
            case "MERCHANT":
                return AccountType.Merchant;
            default:
                throw new IllegalArgumentException("Unknown Value");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
