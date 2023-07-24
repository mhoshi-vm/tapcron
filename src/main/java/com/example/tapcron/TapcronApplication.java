package com.example.tapcron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class TapcronApplication {

    public static void main(String[] args) {
        SpringApplication.run(TapcronApplication.class, args);
    }

    @PostMapping ("/")
    public void post(){
        System.out.println("New Event Came!");
    }

}
