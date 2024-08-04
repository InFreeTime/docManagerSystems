package com.example.docManagerSystems.controller;

import com.example.docManagerSystems.entity.Department;
import com.example.docManagerSystems.entity.Status;
import com.example.docManagerSystems.service.DepartmentService;
import com.example.docManagerSystems.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping
    public List<Status> getAllStatus() {
        return statusService.getAllStatus();
    }

    @PostMapping
    public Status createStatus(@RequestBody Status status) {
        return statusService.createStatus(status);
    }

    @PutMapping("/{id}")
    public Status updateStatus(@PathVariable Long id, @RequestBody Status statusDetails) {
        return statusService.updateStatus(id, statusDetails);
    }
}
