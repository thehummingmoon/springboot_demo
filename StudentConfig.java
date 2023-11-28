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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maria=new Student(1L,
                    "Maria",
                    "mar@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5),
                    21
        );
            Student Vish=new Student(
                    "Vish",
                    "viah@gmail.com",
                    LocalDate.of(2001, Month.MAY,25),
                    22
            );
            repository.saveAll(
                    List.of(maria,Vish)
            );
        };
    }
}
