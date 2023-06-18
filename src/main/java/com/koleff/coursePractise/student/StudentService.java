package com.koleff.coursePractise.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){ //@Qualifier(value = "fake")
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        //TODO wire with real repo...
        return studentRepository.getStudents();
    }

    public Student getStudent(Long id) {
       return studentRepository.getStudents()
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student not found."));
    }
}
