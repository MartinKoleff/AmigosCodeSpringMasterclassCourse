package com.koleff.coursePractise.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Student{
    @Id
    private int id;

    @NotNull(message = "Name must be not empty.")
    private String name;

    @NotNull(message = "Password must be not empty.")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "Email must be not empty.")
    @Email //(regexp = "")
    private String email;

    public Student(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    Student(){

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