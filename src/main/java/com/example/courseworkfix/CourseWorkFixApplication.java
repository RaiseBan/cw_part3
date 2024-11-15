package com.example.courseworkfix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.example.courseworkfix.model")
public class CourseWorkFixApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseWorkFixApplication.class, args);
    }

}
