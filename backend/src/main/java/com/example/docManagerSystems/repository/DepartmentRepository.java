package com.example.docManagerSystems.repository;

import com.example.docManagerSystems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
