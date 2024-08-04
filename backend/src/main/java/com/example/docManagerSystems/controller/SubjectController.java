package com.example.docManagerSystems.controller;

import com.example.docManagerSystems.entity.Subject;
import com.example.docManagerSystems.dto.SubjectDTO;
import com.example.docManagerSystems.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/department/{departmentId}")
    public List<SubjectDTO> getSubjectsByDepartment(@PathVariable Long departmentId) {
        return subjectService.getAllSubjectsByDepartment(departmentId);
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subjectDetails) {
        return subjectService.updateSubject(id, subjectDetails);
    }


}
