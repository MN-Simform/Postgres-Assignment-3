package com.postgres.assignment.services.impl;

import com.postgres.assignment.entity.Employee;
import com.postgres.assignment.repository.EmployeeRepository;
import com.postgres.assignment.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> showEmployee() {
        return employeeRepository.findAll();
    }
}
