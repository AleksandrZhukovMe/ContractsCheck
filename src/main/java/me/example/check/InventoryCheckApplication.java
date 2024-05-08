package me.example.check;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InventoryCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryCheckApplication.class, args);
    }
}
