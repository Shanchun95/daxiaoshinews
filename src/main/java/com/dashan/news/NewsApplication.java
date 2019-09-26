package com.dashan.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class NewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsApplication.class, args);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Spring Boot Start Success!");
        System.out.println("------------------------------------------------------------------------");
    }
}
