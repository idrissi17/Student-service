package com.example.studentdemo;

import com.example.studentdemo.dao.repository.StudentRepository;
import com.example.studentdemo.dto.StudentDTO;
import com.example.studentdemo.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentDemoApplication.class, args);
    }


    @Bean
    CommandLineRunner init(StudentService studentService) {
        return args -> {
            List<StudentDTO> studentDTOS = List.of(
                    StudentDTO.builder().name("name1").email("email1").dateOfBirth("20/2/2022").build(),
                    StudentDTO.builder().name("name2").email("email2").dateOfBirth("20/2/2022").build(),
                    StudentDTO.builder().name("name3").email("email3").dateOfBirth("20/2/2023").build(),
                    StudentDTO.builder().name("name4").email("email4").dateOfBirth("20/2/2024").build()
            );

            for (StudentDTO studentDTO : studentDTOS) {
                studentService.saveStudent(studentDTO);
            }
        };
    }
}
