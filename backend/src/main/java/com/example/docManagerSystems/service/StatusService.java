package com.example.docManagerSystems.service;

import com.example.docManagerSystems.entity.Status;
import com.example.docManagerSystems.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    public Status updateStatus(Long id, Status statusDetails) {
        Optional<Status> optionalStatus = statusRepository.findById(id);
        if (optionalStatus.isPresent()) {
            Status status = optionalStatus.get();
            status.setName(statusDetails.getName());
            return statusRepository.save(status);
        } else {
            throw new RuntimeException("Status not found with id " + id);
        }
    }
}
