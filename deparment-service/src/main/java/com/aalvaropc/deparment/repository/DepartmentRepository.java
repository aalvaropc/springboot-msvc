package com.aalvaropc.deparment.repository;


import com.aalvaropc.deparment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long Departmentid);
}

