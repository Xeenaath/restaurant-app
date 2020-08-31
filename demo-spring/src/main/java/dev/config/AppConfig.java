package dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

// Configuration pilotée par des annotations
@Configuration
// activer la recherche de beans Spring
@ComponentScan("dev") // recherche dans le package "dev" (sous-packages compris)
public class AppConfig {

    // constructeur de bean
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

}
