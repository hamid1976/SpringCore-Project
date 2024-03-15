package com.spiringcore.sapphireassignment;

import java.util.List;

public class Project {
    private int projectId;
    private String projectName;
    private List<Employee> employee;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }


    public Project(){
        super();
    }
    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;

    }

    public Project(int projectId, String projectName, List<Employee> employee) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", employee=" + employee +
                '}';
    }
}
