package com.example.SpringBootAssignment1.Employee.Controller;

import com.example.SpringBootAssignment1.Employee.Entity.Employee;
import com.example.SpringBootAssignment1.Employee.Service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController
{
    @Autowired
    private EmplService emplService;

    @GetMapping("/empl")
    public List<Employee> getEmpl()
    {
        return this.emplService.getAllEmpl();
    }

    @GetMapping("/empl/{emplID}")
    public Employee getEmpl(@PathVariable String emplID)
    {
        return this.emplService.getEmplById(Integer.parseInt(emplID));
    }

    @PostMapping("/empl")
    public Employee addEmpl(@RequestBody Employee employee)
    {
        return this.emplService.addEmpl(employee);
    }

    @PutMapping("/empl")
    public Employee updateEmpl(@RequestBody Employee employee)
    {
        return this.emplService.updateEmployee(employee);
    }

    @DeleteMapping("/empl/{emplID}")
    public String delEmployee(@PathVariable String emplID)
    {
        return this.emplService.delEmplbyID(Integer.parseInt(emplID));
    }
}
