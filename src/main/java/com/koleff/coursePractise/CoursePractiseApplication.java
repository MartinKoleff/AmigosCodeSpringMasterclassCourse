package com.koleff.coursePractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CoursePractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursePractiseApplication.class, args);
	}
}
