package com.example.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.backend.models.Department;
import com.example.backend.repo.DepartmentRepo;
import com.example.backend.services.DepartmentService;


@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService services;

    @GetMapping("/names")
    public List<String> getAllDeptName() {
        return services.getDeptName();
    }

    @GetMapping("/all/details")
    public List<Department> getAllDeptDetails() {
        return services.getAllDetails();
    }
    
}
