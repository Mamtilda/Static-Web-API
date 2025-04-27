package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This annotation is essential for starting the Spring Boot application
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  // This launches the Spring Boot application
    }
}
