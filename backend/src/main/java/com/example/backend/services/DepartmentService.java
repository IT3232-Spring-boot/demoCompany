package com.example.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.Department;
import com.example.backend.repo.DepartmentRepo;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo repo;
 
    public List<String> getDeptName() {
        return repo.getDetpName();
    }

    public List<Department> getAllDetails() {
        return repo.getAllDeptDetails();
    }
}
