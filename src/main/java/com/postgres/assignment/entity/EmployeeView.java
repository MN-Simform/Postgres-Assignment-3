package com.postgres.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;

@Entity (name = "v_emp_dept")
@Immutable
public class EmployeeView {
    @Id
    private Integer empId;
    private String empName;
    private Integer empSal;
    private String deptName;

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getEmpSal() {
        return empSal;
    }

    public String getDeptName() {
        return deptName;
    }
}
