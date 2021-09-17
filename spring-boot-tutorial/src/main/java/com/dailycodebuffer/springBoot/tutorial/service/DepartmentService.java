package com.dailycodebuffer.springBoot.tutorial.service;

import com.dailycodebuffer.springBoot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();
}
