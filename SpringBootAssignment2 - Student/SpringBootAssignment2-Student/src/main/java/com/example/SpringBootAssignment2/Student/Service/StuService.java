package com.example.SpringBootAssignment2.Student.Service;

import com.example.SpringBootAssignment2.Student.Entity.Student;

import java.util.List;

public interface StuService
{
    List<Student> getAllStu();
    Student getstuById(int stuID);
    Student addStu(Student student);
    Student updateStu(Student student);
    String delStubyID(int stuID);
}
