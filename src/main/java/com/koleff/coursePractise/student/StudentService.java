package com.koleff.coursePractise.student;

import com.koleff.coursePractise.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){ //@Qualifier(value = "fake")
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {
       return studentRepository
                .findById(id)
                .orElseThrow(() -> new StudentNotFoundException(
                        String.format("Student with id %d not found.", id)));
    }
}
