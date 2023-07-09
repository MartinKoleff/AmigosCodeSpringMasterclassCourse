package com.koleff.coursePractise.student;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public List<Student> getStudents() {
        //TODO wire with DB...
        return Collections.singletonList(
                new Student(0, "To be implemented...", "password", "email@gmail.com")
        );
    }
}
