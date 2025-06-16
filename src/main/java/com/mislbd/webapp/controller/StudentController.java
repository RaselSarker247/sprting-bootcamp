package com.mislbd.webapp.controller;

import com.mislbd.webapp.entity.Student;
import com.mislbd.webapp.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    final StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity("Student added successfully", HttpStatus.CREATED);
    }
}
