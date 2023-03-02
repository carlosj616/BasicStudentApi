package com.github.BasicStudentApi.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student>getStudents(){
        return List.of(new Student(
                            1L,
                            "John",
                            "john@gmail.com",
                             LocalDate.of(1984, Month.JUNE,16),
                            38
                        ),
                        new Student(
                            2L,
                            "Jane",
                            "jane@gmail.com",
                            LocalDate.of(1982,Month.JUNE,17),
                            40
                        )
                );
    }
}
