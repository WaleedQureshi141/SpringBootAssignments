package com.example.SpringBootAssignment1.Employee.Dao;

import com.example.SpringBootAssignment1.Employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplDao extends JpaRepository<Employee, Integer> {
}
