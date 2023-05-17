package com.postgres.assignment.services;

import com.postgres.assignment.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void saveEmployee(Employee employee);

    public void removeEmployee(Employee employee);

    public Employee findName(String name);

    public List<Employee> showEmployee();
}
