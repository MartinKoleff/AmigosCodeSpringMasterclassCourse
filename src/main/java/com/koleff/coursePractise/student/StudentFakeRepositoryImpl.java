package com.koleff.coursePractise.student;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StudentFakeRepositoryImpl implements StudentRepository{
    @Override
    public List<Student> getStudents() {
        //TODO wire with DB...
        return Arrays.asList(
                new Student(1, "Marto", "ceoOfSex123", "koleff@koleff.bg"),
                new Student(2, "Petko", "sajdiImaLi", "petko_reshetko@aitos.bg")
        );
    }
}
