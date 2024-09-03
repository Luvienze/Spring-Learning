package com.luvienze.cruddemo.dao;

import com.luvienze.cruddemo.entity.Student;

public interface StudentDao {
    void save(Student theStudent);

    Student findById(Integer id);
}
