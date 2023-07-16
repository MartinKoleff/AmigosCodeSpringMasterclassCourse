package com.koleff.coursePractise.exceptions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){

        //Returned to the client
        ApiException payload = new ApiException(
                e.getMessage(),
                e.getCause(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );

        System.out.println("Error thrown with status code: " + payload.getHttpStatusCode());

        return new ResponseEntity(
                payload,
                payload.getHttpStatus()
        );
    }

    @ExceptionHandler(value = StudentNotFoundException.class)
    public ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException e){

        //Returned to the client
        ApiException payload = new ApiException(
                e.getMessage(),
                e.getCause(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now()
        );

        System.out.println("Error thrown with status code: " + payload.getHttpStatusCode());

        return new ResponseEntity(
                payload,
                payload.getHttpStatus()
        );
    }
}
