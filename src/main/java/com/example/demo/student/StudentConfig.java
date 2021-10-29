package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student amine = new Student(
                      "Amine",
                            "amine@gmail.com",
                            LocalDate.of(1997, Month.FEBRUARY, 23)
            );
            Student richard = new Student(
                    "Richard",
                    "richard@gmail.com",
                    LocalDate.of(1950, Month.FEBRUARY, 23)
            );

            repository.saveAll(
                    List.of(amine, richard)
            );
        };


    }
}
