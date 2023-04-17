package com.example.SpringBootAssignment2.Student.Dao;

import com.example.SpringBootAssignment2.Student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuDao extends JpaRepository<Student, Integer> {
}
