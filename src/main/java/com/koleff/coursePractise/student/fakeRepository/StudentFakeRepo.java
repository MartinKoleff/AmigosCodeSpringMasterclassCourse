package com.koleff.coursePractise.student.fakeRepository;

import com.koleff.coursePractise.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentFakeRepo {

    List<Student> getStudents();
}
