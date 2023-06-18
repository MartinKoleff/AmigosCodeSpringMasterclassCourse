package com.koleff.coursePractise.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/v1/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/")
    void createNewStudent(@RequestBody Student student){
        System.out.println("POST REQUEST PASSED!");
        System.out.println("Student -> " + student);
    }
}
