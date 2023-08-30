package com.codecool.studentsystem.service;

import com.codecool.studentsystem.model.Student;

import java.util.List;


public interface StudentService {
    Student saveStudent(Student student);

    public List<Student> getAllStudents();


}
