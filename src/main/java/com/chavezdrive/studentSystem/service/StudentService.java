package com.chavezdrive.studentSystem.service;

import com.chavezdrive.studentSystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
