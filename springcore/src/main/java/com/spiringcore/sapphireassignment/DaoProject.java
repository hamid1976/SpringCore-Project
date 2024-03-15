package com.spiringcore.sapphireassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoProject {

    ApplicationContext context = new ClassPathXmlApplicationContext("MiniApplicationContext.xml");

    public  void getAllProjectsFullDetail(){

        Project project1 = (Project) context.getBean("project1");
        Project project2 = (Project) context.getBean("project2");
        Project project3 = (Project) context.getBean("project3");

        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Employee employee3 = (Employee) context.getBean("employee3");
        Employee employee4 = (Employee) context.getBean("employee4");



        System.out.println("Project Name:"+project1.getProjectName());
        System.out.println("Employees in "+project1.getProjectName()+" are:"+ employee1.getEmpName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Project Name:"+project2.getProjectName());
        System.out.println("Employees in "+project2.getProjectName()+" are:"+ employee1.getEmpName()+" & "+employee2.getEmpName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Project Name:"+project3.getProjectName());
        System.out.println("Employees in "+project3.getProjectName()+" are:"+ employee2.getEmpName());
    }//end getAllEmployeesFullDetail


    public  void getEmployeesName(){
        Project project1 = (Project) context.getBean("project1");
        Project project2 = (Project) context.getBean("project2");
        Project project3 = (Project) context.getBean("project3");

        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        Employee employee3 = (Employee) context.getBean("employee3");
        Employee employee4 = (Employee) context.getBean("employee4");





        System.out.println("Employees in "+project1.getProjectName()+" are:"+ employee1.getEmpName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Employees in "+project2.getProjectName()+" are:"+ employee1.getEmpName()+" & "+employee2.getEmpName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Employees in "+project3.getProjectName()+" are:"+ employee2.getEmpName());
    }//end get DepartmentName



}
