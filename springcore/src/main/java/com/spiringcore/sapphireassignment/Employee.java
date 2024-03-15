package com.spiringcore.sapphireassignment;

import java.util.*;

public class Employee {
    private int empId;
    private String empName;
    private Department department;
    private List<Project> project;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public Employee(){
        super();
    }
    public Employee(int empId,String empName){
        super();
        this.empId = empId;
        this.empName = empName;
    }
    public Employee(int empId, String empName, Department department, List<Project> project) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department=" + department +
                ", project=" + project +
                '}';
    }

//    public String toString() {
//        return "Employee{" +
//                "id=" + empName +
//                ", name='" + empName + '\'' +
//                ", department=" + department.getDeptName() +
//                ", projects=" + Arrays.toString(project.toArray()) +
//                '}';
//    }
}
