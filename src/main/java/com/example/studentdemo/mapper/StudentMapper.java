package com.example.studentdemo.mapper;

import com.example.studentdemo.dao.entities.Student;
import com.example.studentdemo.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private ModelMapper modelMapper =new ModelMapper();

    public StudentDTO fromStudentToStudentDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }
    public Student fromStudentDTOToStudent(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}
