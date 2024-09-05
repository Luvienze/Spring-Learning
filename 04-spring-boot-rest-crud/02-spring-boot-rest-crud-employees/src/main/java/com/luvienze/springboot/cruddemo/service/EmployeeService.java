package com.luvienze.springboot.cruddemo.service;

import com.luvienze.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
