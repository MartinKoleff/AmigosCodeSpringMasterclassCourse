package com.koleff.coursePractise.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class Student{
    private final int id;

    @NotNull(message = "Name must be not empty.")
    private final String name;

    @NotNull(message = "Password must be not empty.")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    @NotNull(message = "Email must be not empty.")
    @Email //(regexp = "")
    private final String email;

    public Student(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @JsonProperty(value = "studentName")
    public String getName() {
        return name;
    }

    @JsonProperty(value = "studentId")
    public int getId() {
        return id;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonProperty(value = "studentEmail")
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}