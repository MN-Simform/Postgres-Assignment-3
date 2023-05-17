package com.postgres.assignment.repository;

import com.postgres.assignment.entity.EmployeeView;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeViewRepository extends ReadOnlyRepository<EmployeeView, Integer> {
}
