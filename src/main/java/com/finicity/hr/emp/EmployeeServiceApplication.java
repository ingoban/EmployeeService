package com.finicity.hr.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.finicity.hr.emp.repository") 
@EnableMongoRepositories("com.finicity.hr.emp.mongo.repository")
public class EmployeeServiceApplication {
    // Starting class
    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

}
