package com.spiringcore.sapphireassignment;

import java.util.List;

public class Department {
    private int deptId;
    private String deptName;
    private List<Employee> employee;
    private List<Project> project;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public Department(){
        super();
    }
    public Department(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;

    }

    public Department(int deptId, String deptName, List<Employee> employee, List<Project> project) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
        this.employee = employee;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", employee=" + employee +
                ", project=" + project +
                '}';
    }
}
