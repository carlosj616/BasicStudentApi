package com.github.BasicStudentApi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student student1 = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, Month.JUNE,16)
            );
            Student student2 = new Student(
                    "Jane",
                    "jane@gmail.com",
                    LocalDate.of(1982,Month.JUNE,17)
            );
            studentRepository.saveAll(List.of(student1,student2));
        };
    }
}
