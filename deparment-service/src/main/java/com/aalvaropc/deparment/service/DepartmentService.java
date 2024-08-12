package com.aalvaropc.deparment.service;


import com.aalvaropc.deparment.entity.Department;
import com.aalvaropc.deparment.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    public Department findDepartmentById;
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long Departmentid) {
        return departmentRepository.findByDepartmentId(Departmentid);
    }

}
