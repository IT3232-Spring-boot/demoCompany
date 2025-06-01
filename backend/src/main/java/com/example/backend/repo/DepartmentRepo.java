package com.example.backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.backend.models.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

    @Query("select name from Department")
    public List<String> getDetpName();

    @Query("select d from Department d")
    public List<Department> getAllDeptDetails();
}
