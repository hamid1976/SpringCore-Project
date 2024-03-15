package com.spiringcore.sapphireassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoDepartment{
    ApplicationContext context = new ClassPathXmlApplicationContext("MiniApplicationContext.xml");

    public void GetAllDepartmentsFullDetail(){
        Department department1 = (Department) context.getBean("department1");
        Department department2 = (Department) context.getBean("department2");


        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Employee employee3 = (Employee) context.getBean("employee3");
        Employee employee4 = (Employee) context.getBean("employee4");


        Project project1 = (Project) context.getBean("project1");
        Project project2 = (Project) context.getBean("project2");
        Project project3 = (Project) context.getBean("project3");


        System.out.println("Department Name :"+department1.getDeptName());
        System.out.println("Employees In Department" +department1.getDeptName()+ " are : "+employee1.getEmpName());
        System.out.println("Project Assigned to Department " + department1.getDeptName()+" are : "+ project1.getProjectName()+" & "+ project2.getProjectName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Department Name :"+department2.getDeptName());
        System.out.println("Employees In Department "+department2.getDeptName()+" are : "+employee2.getEmpName());
        System.out.println("Project Assigned to Department "+department2.getDeptName()+" are : "+ project2.getProjectName()+" & "+ project3.getProjectName());
    }

    public void getEmployees(){
        Department department1 = (Department) context.getBean("department1");
        Department department2 = (Department) context.getBean("department2");


        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Employee employee3 = (Employee) context.getBean("employee3");
        Employee employee4 = (Employee) context.getBean("employee4");

        System.out.println("Employees In Department " +department1.getDeptName()+ " is : "+employee1.getEmpName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Employees In Department "+department2.getDeptName()+" is : "+employee2.getEmpName());
    }

    public void getProjects(){
        Department department1 = (Department) context.getBean("department1");
        Department department2 = (Department) context.getBean("department2");


        Project project1 = (Project) context.getBean("project1");
        Project project2 = (Project) context.getBean("project2");
        Project project3 = (Project) context.getBean("project3");

        System.out.println("Project Assigned to Department " + department1.getDeptName()+" are : "+ project1.getProjectName()+" & "+ project2.getProjectName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Project Assigned to Department  " + department2.getDeptName()+" are : "+ project2.getProjectName()+" & "+ project3.getProjectName());
    }
}
