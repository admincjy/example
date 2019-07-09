package com.maybe.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 */
@EnableFeignClients
@SpringBootApplication
public class ProductConsumer_80 {

    public static void main(String[] args) {

        SpringApplication.run(ProductConsumer_80.class, args);
    }

}
