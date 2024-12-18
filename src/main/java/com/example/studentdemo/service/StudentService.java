package com.example.studentdemo.service;

import com.example.studentdemo.dao.entities.Student;
import com.example.studentdemo.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);
    public List<StudentDTO> getSudentByDateOfBirth(String dateOfBirth);
}
