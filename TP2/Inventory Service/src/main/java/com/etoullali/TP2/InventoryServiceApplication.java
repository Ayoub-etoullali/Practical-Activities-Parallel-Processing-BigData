package com.etoullali.TP2;

import ch.qos.logback.core.testUtil.RandomUtil;
import com.etoullali.TP2.entities.Product;
import com.etoullali.TP2.repositories.ProductRepository;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {

            Stream.of("Imprimante", "Ordinateur", "Smartphone").forEach(p -> {

                productRepository.save(new Product(p, RandomUtils.nextInt(1000), RandomUtils.nextInt(30)));

            });

            productRepository.findAll().forEach(System.out::println);
        };
    }

}
