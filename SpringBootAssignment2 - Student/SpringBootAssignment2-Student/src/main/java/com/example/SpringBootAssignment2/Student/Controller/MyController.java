package com.example.SpringBootAssignment2.Student.Controller;

import com.example.SpringBootAssignment2.Student.Entity.Student;
import com.example.SpringBootAssignment2.Student.Service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController
{
    @Autowired
    private StuService stuService;

    @GetMapping("/student")
    public List<Student> getStu()
    {
        return this.stuService.getAllStu();
    }

    @GetMapping("/student/{stuID}")
    public Student getStu(@PathVariable String stuID)
    {
        return this.stuService.getstuById(Integer.parseInt(stuID));
    }

    @PostMapping("/student")
    public Student addStu(@RequestBody Student student)
    {
        return this.stuService.addStu(student);
    }

    @PutMapping("/student")
    public Student updateStu(@RequestBody Student student)
    {
        return this.stuService.updateStu(student);
    }

    @DeleteMapping("/student/{stuID}")
    public String delStu(@PathVariable String stuID)
    {
        return this.stuService.delStubyID(Integer.parseInt(stuID));
    }
}
