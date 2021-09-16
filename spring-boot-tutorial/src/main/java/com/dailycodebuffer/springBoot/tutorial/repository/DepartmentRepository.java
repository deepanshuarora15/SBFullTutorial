package com.dailycodebuffer.springBoot.tutorial.repository;

import com.dailycodebuffer.springBoot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
