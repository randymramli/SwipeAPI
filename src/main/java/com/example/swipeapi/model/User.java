package com.example.swipeapi.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Data
@Document(collection = "User")
public class User {

    @Id
    @GeneratedValue
    private UUID idNum = UUID.randomUUID();
    @Indexed(unique = true)
    private String username;
    private String password;
    private String email;
    private Double accountBalance;

    public User(String username, String password, String email, Double accountBalance) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    public User() {
        username = "";
        password = "";
        email = "";
        accountBalance = 0.0;
    }
}

