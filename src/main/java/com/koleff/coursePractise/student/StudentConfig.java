package com.koleff.coursePractise.student;

import com.koleff.coursePractise.student.fakeRepository.StudentFakeRepo;
import com.koleff.coursePractise.student.fakeRepository.StudentFakeRepoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Value("${app.useFakeStudentRepository:false}")
    private Boolean useFakeStudentRepository;


    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner...");
        };
    }

    @Bean
    StudentFakeRepo studentFakeRepo() {
        System.out.printf("Use fake student repository -> %s\n", useFakeStudentRepository);

        return new StudentFakeRepoImpl();
    }
}
