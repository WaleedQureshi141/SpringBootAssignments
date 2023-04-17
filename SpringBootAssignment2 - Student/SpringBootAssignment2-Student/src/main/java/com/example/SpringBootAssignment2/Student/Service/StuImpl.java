package com.example.SpringBootAssignment2.Student.Service;

import com.example.SpringBootAssignment2.Student.Dao.StuDao;
import com.example.SpringBootAssignment2.Student.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StuImpl implements StuService
{
    @Autowired
    private StuDao stuDao;

    @Override
    public List<Student> getAllStu() {
        return this.stuDao.findAll();
    }

    @Override
    public Student getstuById(int stuID) {
        Optional<Student> s = this.stuDao.findById(stuID);
        Student student = null;

        if (s.isPresent())
        {
            student = s.get();
        }
        else
        {
            throw new RuntimeException("Student not found for ID: " + stuID);
        }
        return student;
    }

    @Override
    public Student addStu(Student student) {
        return this.stuDao.save(student);
    }

    @Override
    public Student updateStu(Student student) {
        return this.stuDao.save(student);
    }

    @Override
    public String delStubyID(int stuID) {
        this.stuDao.deleteById(stuID);
        return "Student Data Removed";
    }
}
