package com.maybe.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringbootBoot01Init02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBoot01Init02Application.class, args);
    }

}
