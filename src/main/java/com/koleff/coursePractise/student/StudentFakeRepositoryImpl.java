package com.koleff.coursePractise.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
//@Repository(value = "fake")
public class StudentFakeRepositoryImpl implements StudentRepository{
    @Override
    public List<Student> getStudents() {
        //TODO wire with DB...
        return Arrays.asList(
                new Student(1, "Marto"),
                new Student(2, "Petko")
        );
    }
}
