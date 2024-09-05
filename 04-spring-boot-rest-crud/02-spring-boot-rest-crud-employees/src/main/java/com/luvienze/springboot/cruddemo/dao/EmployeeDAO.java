package com.luvienze.springboot.cruddemo.dao;

import com.luvienze.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theID);

    Employee save(Employee theEmployee);

    void deleteById(int theID);
}
