package com.luvienze.demo.rest;

import com.luvienze.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once

    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();
        theStudents.add(new Student("Pornima","Patel"));
        theStudents.add(new Student("Mario","Rossie"));
        theStudents.add(new Student("Mary","Smith"));
    }

    // define endpoint for "/students" - return a list of students

    @GetMapping("/students")
        public List<Student> getStudents(){
            return theStudents;
        }
    // define endpoint or "/students/@studentId} - return student ad index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        // just index into the list

        // check the studentID again the list size

        if(studentId >= theStudents.size() || (studentId <0)){
            throw  new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }

    // Add an exception handler using @ExceptionHandler

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){

        // create a StudentErrorResponse
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // return ResponseEntity
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
