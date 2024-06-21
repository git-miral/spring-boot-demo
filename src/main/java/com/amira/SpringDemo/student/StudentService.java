package com.amira.SpringDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {
    public List<student> findAllStudents() {
        return List.of(
                new student("amira", "hammami", LocalDate.now(), "amirahammami@gmail.com",32),
                new student("amiral", "hammami", LocalDate.now(), "amiralhammami@gmail.com",23),
                new student("amir", "hammami", LocalDate.now(), "amirhammami@gmail.com",34));
    }
}
