package com.koleff.coursePractise.student.fakeRepository;

import com.koleff.coursePractise.student.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StudentFakeRepoImpl implements StudentFakeRepo {
    @Override
    public List<Student> getStudents() {
        //TODO wire with DB...
        return Arrays.asList(
                new Student(1, "Marto", "ceoOfSex123", "koleff@koleff.bg"),
                new Student(2, "Petko", "sajdiImaLi", "petko_reshetko@aitos.bg")
        );
    }
}
