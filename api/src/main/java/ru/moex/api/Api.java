package ru.moex.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ru.moex.api.**.model")
@EnableJpaRepositories(basePackages = "ru.moex.api.**.repository")
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }
}
