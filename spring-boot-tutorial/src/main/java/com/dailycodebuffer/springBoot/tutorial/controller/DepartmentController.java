package com.dailycodebuffer.springBoot.tutorial.controller;

import com.dailycodebuffer.springBoot.tutorial.entity.Department;
import com.dailycodebuffer.springBoot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/getDepartment/{Id}")
    public Department getDepartmentById(@PathVariable Long Id){
        return departmentService.getDepartmentById(Id);
    }

    @GetMapping("/getDepartmentByName/{departmentName}")
    public Department getDepartmentByName(@PathVariable String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }

    @GetMapping("/getDepartmentByNameIgnoreCase/{departmentName}")
    public Department getDepartmentByNameIgnoreCase(@PathVariable String departmentName){
        return departmentService.getDepartmentByNameIgnoreCase(departmentName);
    }

    @DeleteMapping(path = "/deleteDepartment/{departmentId}")
    public String deleteDepartmentById(@PathVariable Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department " + departmentId.toString() + " deleted successfully";
    }

    @PutMapping("/updateDepartment/{departmentId}")
    public Department updateDepartment(@PathVariable Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }


}
