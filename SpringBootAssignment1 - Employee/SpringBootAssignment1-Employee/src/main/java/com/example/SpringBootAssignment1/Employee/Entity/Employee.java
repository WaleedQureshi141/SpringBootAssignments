package com.example.SpringBootAssignment1.Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emplID;
    private String Name;
    private String jobTitle;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String jobTitle, int salary) {
        Name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
