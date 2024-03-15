package com.spiringcore.sapphireassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoEmployee {

    ApplicationContext context = new ClassPathXmlApplicationContext("MiniApplicationContext.xml");

    public  void getAllEmployeesFullDetail(){
        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Department department1 = (Department) context.getBean("department1");
        Department department2 = (Department) context.getBean("department2");
        Project project1 = (Project) context.getBean("project1");
        Project project2 = (Project) context.getBean("project2");
        Project project3 = (Project) context.getBean("project3");


        System.out.println("Employee Name:"+employee1.getEmpName());
        System.out.println("Works In Department:"+department1.getDeptName());
        System.out.println("Project Assigned are:"+ project1.getProjectName()+" & "+ project2.getProjectName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Employee Name:"+employee2.getEmpName());
        System.out.println("Works In Department:"+department2.getDeptName());
        System.out.println("Project Assigned are:"+ project2.getProjectName()+" & "+ project3.getProjectName());
    }//end getAllEmployeesFullDetail


    public  void getDepartmentName(){
        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Department department1 = (Department) context.getBean("department1");
        Department department2 = (Department) context.getBean("department2");
        System.out.println("Employee "+employee1.getEmpName()+" Works In Department:"+department1.getDeptName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Employee "+employee2.getEmpName()+ " Works In Department:"+department2.getDeptName());
    }//end get DepartmentName


    public  void getProjectName(){
        Project project1 = (Project) context.getBean("project1");
        Project project2 = (Project) context.getBean("project2");
        Project project3 = (Project) context.getBean("project3");

        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");

        System.out.println("Project Assigned to employee "+employee1.getEmpName()+" are : "+ project1.getProjectName()+" & "+ project2.getProjectName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Project Assigned to employee "+employee1.getEmpName()+" are : "+ project2.getProjectName()+" & "+ project3.getProjectName());
    }//end getAllEmployeesFullDetail
}
