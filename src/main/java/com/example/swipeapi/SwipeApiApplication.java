package com.example.swipeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SwipeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwipeApiApplication.class, args);
    }

    @GetMapping
    public String welcome() {
        return "Welcome to SwipeAPI";
    }

}
