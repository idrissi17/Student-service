package com.example.studentdemo.web;


import com.example.studentdemo.dto.StudentDTO;
import com.example.studentdemo.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentGraphQLController {

    private StudentService studentService;

    public StudentGraphQLController(StudentService studentService) {
        this.studentService = studentService;
    }


    @QueryMapping
    public List<StudentDTO> getStudentByDateOfBirth(@Argument String date) {
        return studentService.getSudentByDateOfBirth(date);
    }

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student) {
        return studentService.saveStudent(student);
    }



}
