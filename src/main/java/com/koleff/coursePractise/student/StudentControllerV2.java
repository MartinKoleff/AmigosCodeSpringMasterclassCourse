package com.koleff.coursePractise.student;

import com.koleff.coursePractise.exceptions.ApiRequestException;
import com.koleff.coursePractise.exceptions.StudentNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/students")
public class StudentControllerV2 {

    private final StudentService studentService;

    @Autowired
    public StudentControllerV2(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Long id) {
        return studentService.getStudent(id);
    }

    @GetMapping(path = "{studentId}/exception")
    public Student getStudentException(@PathVariable("studentId") Long id) {
       throw new ApiRequestException(
               "API REQUEST EXCEPTION for adding student with id " + id
       );
    }

    @PostMapping
    void createNewStudent(@Valid @RequestBody Student student){
        System.out.println("POST REQUEST V2 RECEIVED!");
        System.out.println("Student -> " + student);
    }

    @PutMapping
    void updateStudent(@RequestBody Student student){
        System.out.println("UPDATE REQUEST V2 RECEIVED!");
        System.out.println("Student -> " + student);
    }

    @DeleteMapping(path = "{studentId}")
    void deleteStudent(@PathVariable("studentId") Long id){
        System.out.println("DELETE REQUEST V2 RECEIVED!");
        System.out.println("Student deleted with id -> " + id);
    }
}
