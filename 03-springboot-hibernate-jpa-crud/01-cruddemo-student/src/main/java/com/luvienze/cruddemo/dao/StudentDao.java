package com.luvienze.cruddemo.dao;

import com.luvienze.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName (String theLastName);

    void update(Student theStudent)
}
