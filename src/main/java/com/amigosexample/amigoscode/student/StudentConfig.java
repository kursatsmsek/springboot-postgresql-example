package com.amigosexample.amigoscode.student;

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
            Student carole = new Student(
                    "Carole",
                    "carolesun@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 5)
            );

            Student robin = new Student(
                    "Robin",
                    "robin@yandex.com",
                    LocalDate.of(2011, Month.APRIL, 1)
            );

            repository.saveAll(List.of(carole, robin));
        };
    }
}
