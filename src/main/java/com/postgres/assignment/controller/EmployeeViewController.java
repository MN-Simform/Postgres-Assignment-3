package com.postgres.assignment.controller;

import com.postgres.assignment.entity.EmployeeView;
import com.postgres.assignment.services.EmployeeViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewEmployee")
public class EmployeeViewController {

    @Autowired
    EmployeeViewService employeeViewService;

    @RequestMapping("/")
    public List<EmployeeView> showEmp(){
        return employeeViewService.showAllEmp();
    }
}
