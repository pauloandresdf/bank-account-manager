package com.example.bankingsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.bankingsystem")
public class Main {

    @Bean
    public BankingSystem bankingSystem() {
        return new BankingSystem();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        TerminalController controller = context.getBean(TerminalController.class);

        System.out.println("Bem-vindo ao SimulaBancoTerminal!");
        controller.start();

        context.close();
    }
}