package com.example.bankingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankingApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BankingApplication.class, args);

        TerminalController controller = context.getBean(TerminalController.class);
        controller.start();
    }
}