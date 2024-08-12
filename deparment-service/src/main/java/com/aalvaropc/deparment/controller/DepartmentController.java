package com.aalvaropc.deparment.controller;

import com.aalvaropc.deparment.entity.Department;
import com.aalvaropc.deparment.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDeparment(@RequestBody Department department){
            log.info("inside");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long Departmentid){
        return departmentService.findDepartmentById(Departmentid);
    }
}
