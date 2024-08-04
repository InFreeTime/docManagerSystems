package com.example.docManagerSystems.repository;

import com.example.docManagerSystems.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    List<Subject> findByDepartmentDepartmentId(Long departmentId);

//    @Query("SELECT s FROM Subject s LEFT JOIN FETCH s.status")
//    List<Subject> findWithStatusByDepartmentDepartmentId(Long departmentId);

}
