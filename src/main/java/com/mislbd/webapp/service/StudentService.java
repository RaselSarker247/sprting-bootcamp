package com.mislbd.webapp.service;

import com.mislbd.webapp.entity.Student;
import com.mislbd.webapp.repsitory.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    final StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
