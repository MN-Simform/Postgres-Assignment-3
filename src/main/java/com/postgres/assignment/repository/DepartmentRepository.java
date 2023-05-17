package com.postgres.assignment.repository;

import com.postgres.assignment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("select d from Department d where d.deptId=?1")
    public Department findDept(Integer dept_id);
}
