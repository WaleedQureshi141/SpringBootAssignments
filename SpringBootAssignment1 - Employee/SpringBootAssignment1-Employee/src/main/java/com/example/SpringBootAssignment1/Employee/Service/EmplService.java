package com.example.SpringBootAssignment1.Employee.Service;

import com.example.SpringBootAssignment1.Employee.Entity.Employee;

import java.util.List;

public interface EmplService
{
    List<Employee> getAllEmpl();
    Employee getEmplById(int emplID);
    Employee addEmpl(Employee employee);
    Employee updateEmployee(Employee employee);
    String delEmplbyID(int emplID);
}
