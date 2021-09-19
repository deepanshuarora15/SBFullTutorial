package com.dailycodebuffer.springBoot.tutorial.service;

import com.dailycodebuffer.springBoot.tutorial.entity.Department;
import com.dailycodebuffer.springBoot.tutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.springBoot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(id);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department not found corresponding to department id "+ id);
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department departmentfromDb = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())
            && department.getDepartmentName().length()!=0
        ){
            departmentfromDb.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress())
                && department.getDepartmentAddress().length()!=0
        ){
            departmentfromDb.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode())
                && department.getDepartmentCode().length()!=0
        ){
            departmentfromDb.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(departmentfromDb);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findDepartmentByDepartmentName(departmentName);
    }

    @Override
    public Department getDepartmentByNameIgnoreCase(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
