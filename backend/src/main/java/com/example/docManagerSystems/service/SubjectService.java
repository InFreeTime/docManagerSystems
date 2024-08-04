package com.example.docManagerSystems.service;

import com.example.docManagerSystems.entity.Subject;
import com.example.docManagerSystems.converter.SubjectConverter;
import com.example.docManagerSystems.dto.SubjectDTO;
import com.example.docManagerSystems.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<SubjectDTO> getAllSubjectsByDepartment(Long departmentId) {
        List<Subject> subjects = subjectRepository.findByDepartmentDepartmentId(departmentId);
        return subjects.stream()
                .map(SubjectConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject updateSubject(Long id, Subject subjectDetails) {
        Optional<Subject> optionalSubject = subjectRepository.findById(id);
        if (optionalSubject.isPresent()) {
            Subject subject = optionalSubject.get();
            subject.setName(subjectDetails.getName());
            subject.setDescription(subjectDetails.getDescription());
            subject.setBudget(subjectDetails.getBudget());
            subject.setUsers_id(subjectDetails.getUsers_id());
            subject.setDepartment(subjectDetails.getDepartment());
            subject.setStatus(subjectDetails.getStatus());
            subject.setCreated_date(subjectDetails.getCreated_date());
            subject.setModified_date(subjectDetails.getModified_date());
            return subjectRepository.save(subject);
        } else {
            throw new RuntimeException("Subject not found with id " + id);
        }
    }


//    @Autowired
//    private SubjectRepository subjectRepository;
//
//
//    public List<Subject> getAllSubjectsByDepartment(Long departmentId) {
//        return subjectRepository.findByDepartmentDepartmentId(departmentId);
//    }
//
//    public Subject createSubject(Subject subject) {
//        return subjectRepository.save(subject);
//    }


}
