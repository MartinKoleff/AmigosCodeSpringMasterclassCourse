package com.koleff.coursePractise.student;

import com.koleff.coursePractise.student.fakeRepository.StudentFakeRepo;
import com.koleff.coursePractise.student.fakeRepository.StudentFakeRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class StudentConfig {

    @Value("${app.useFakeStudentRepository:false}")
    private Boolean useFakeStudentRepository;

    @Value("${info.company.name}")
    private String companyName;

    @Autowired //inject in constructor...
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner...");
            System.out.println(companyName);
            System.out.println(environment.getProperty("info.app.version"));
        };
    }

    @Bean
    StudentFakeRepo studentFakeRepo() {
        System.out.printf("Use fake student repository -> %s\n", useFakeStudentRepository);

        return new StudentFakeRepoImpl();
    }
}
