package com.example.SpringBootAssignment1.Employee.Service;

import com.example.SpringBootAssignment1.Employee.Dao.EmplDao;
import com.example.SpringBootAssignment1.Employee.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmplService
{
    @Autowired
    private EmplDao emplDao;

    @Override
    public List<Employee> getAllEmpl() {
        return this.emplDao.findAll();
    }

    @Override
    public Employee getEmplById(int emplID) {
        Optional<Employee> e = this.emplDao.findById(emplID);
        Employee employee = null;

        if (e.isPresent())
        {
            employee = e.get();
        }
        else
        {
            throw new RuntimeException("Employee not found for ID: " + emplID);
        }
        return employee;
    }

    @Override
    public Employee addEmpl(Employee employee) {
        return this.emplDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.emplDao.save(employee);
    }

    @Override
    public String delEmplbyID(int emplID) {
        this.emplDao.deleteById(emplID);
        return "Employee Data Removed";
    }
}
