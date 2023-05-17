package com.postgres.assignment.services.impl;

import com.postgres.assignment.entity.EmployeeView;
import com.postgres.assignment.repository.EmployeeViewRepository;
import com.postgres.assignment.services.EmployeeViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeViewServiceImpl implements EmployeeViewService {

    @Autowired
    EmployeeViewRepository employeeViewRepository;

    @Override
    public List<EmployeeView> showAllEmp() {
        return employeeViewRepository.findAll();
    }
}
