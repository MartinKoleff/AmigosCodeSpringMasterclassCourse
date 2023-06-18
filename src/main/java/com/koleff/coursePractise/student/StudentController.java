package com.koleff.coursePractise.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
@Deprecated
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    void createNewStudent(@RequestBody Student student){
        System.out.println("POST REQUEST RECEIVED!");
        System.out.println("Student -> " + student);
    }

    @PutMapping
    void updateStudent(@RequestBody Student student){
        System.out.println("UPDATE REQUEST RECEIVED!");
        System.out.println("Student -> " + student);
    }

    @DeleteMapping(path = "{studentId}")
    void deleteStudent(@PathVariable("studentId") Long id){
        System.out.println("DELETE REQUEST RECEIVED!");
        System.out.println("Student deleted with id -> " + id);
    }
}
