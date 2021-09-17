package com.dailycodebuffer.springBoot.tutorial.controller;

import com.dailycodebuffer.springBoot.tutorial.entity.Department;
import com.dailycodebuffer.springBoot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/getAllDepartments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
