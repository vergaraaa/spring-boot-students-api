package com.vergaraaa.students.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vergara = new Student(
                    "vergara",
                    "vergara@gmail.com",
                    LocalDate.of(2001, 01, 13));

            Student montiel = new Student(
                    "montiel",
                    "montiel@gmail.com",
                    LocalDate.of(2001, 01, 12));

            repository.saveAll(
                    List.of(vergara, montiel));
        };
    }
}
