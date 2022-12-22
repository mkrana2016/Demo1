package com.student.studentportal.service;

import com.student.studentportal.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

