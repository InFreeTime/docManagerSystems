package com.example.docManagerSystems.converter;
import com.example.docManagerSystems.dto.SubjectDTO;
import com.example.docManagerSystems.entity.Subject;

public class SubjectConverter {
    public static SubjectDTO convertToDTO(Subject subject) {
        SubjectDTO dto = new SubjectDTO();
        dto.setSubjectId(subject.getSubjectId());
        dto.setName(subject.getName());
        dto.setDescription(subject.getDescription());
        dto.setBudget(subject.getBudget());
        dto.setUsers_id(subject.getUsers_id());
        dto.setDepartmentName(subject.getDepartment().getName());
        dto.setStatusName(subject.getStatus().getName());
        dto.setCreated_date(subject.getCreated_date());
        dto.setModified_date(subject.getModified_date());
        return dto;
    }
}
