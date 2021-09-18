package com.dailycodebuffer.springBoot.tutorial.service;

import com.dailycodebuffer.springBoot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);

    Department getDepartmentByNameIgnoreCase(String departmentName);
}
