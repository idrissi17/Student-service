package com.example.studentdemo.dao.repository;

import com.example.studentdemo.dao.entities.Student;
import com.example.studentdemo.dto.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByDateOfBirth(String dateOfBirth);
}
