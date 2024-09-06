package com.luvienze.springboot.cruddemo.service;

import com.luvienze.springboot.cruddemo.dao.EmployeeRepository;
import com.luvienze.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository){
        employeeRepository = theEmployeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theID) {
        Optional<Employee> result = employeeRepository.findById(theID);

        Employee theEmployee = null;
        if(result.isPresent()){
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee

            throw  new RuntimeException("Did not fins employee id - " + theID);
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theID) {
        employeeRepository.deleteById(theID);
    }
}
