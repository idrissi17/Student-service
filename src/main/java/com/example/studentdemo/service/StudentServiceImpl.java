package com.example.studentdemo.service;


import com.example.studentdemo.dao.entities.Student;
import com.example.studentdemo.dao.repository.StudentRepository;
import com.example.studentdemo.dto.StudentDTO;
import com.example.studentdemo.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;
    private StudentRepository studentRepository;


    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        try {
            Student student = studentMapper.fromStudentDTOToStudent(studentDTO);
            Student savedStudent = studentRepository.save(student);
            return studentMapper.fromStudentToStudentDTO(savedStudent);
        } catch (Exception e) {
            throw new RuntimeException("Error saving student");
        }
    }

    @Override
    public List<StudentDTO> getSudentByDateOfBirth(String dateOfBirth) {
        List<Student> studentList = studentRepository.findByDateOfBirth(dateOfBirth);
        return studentList.stream().map(studentMapper::fromStudentToStudentDTO).toList();
    }
}
