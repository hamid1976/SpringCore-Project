package com.spiringcore.sapphireassignment;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class TestFactoryBean {
    public static void main(String[] args) {
       // BeanFactory factory = new BeanFactoryXmlApplicationContext("config.xml");

        Resource r=new ClassPathResource("config.xml");
        BeanFactory factory=new XmlBeanFactory(r);


        Employee employee1 = (Employee) factory.getBean("employee1");
        Employee employee2 = (Employee) factory.getBean("employee2");
        Department department1 = (Department) factory.getBean("department1");

        Project project1 = (Project) factory.getBean("project1");
        Project project2 = (Project) factory.getBean("project2");
        Project project3 = (Project) factory.getBean("project3");

//        System.out.println(employee1.getEmpName() + " works in the " + department1.getDeptName() +
//                " department and is assigned to the " + project1.getProjectName() + " and " + project2.getProjectName() + " projects.");
//        System.out.println(employee2.getEmpName() + " works in the " + department1.getDeptName() +
//                " department and is assigned to the " + project2.getProjectName() + " and " + project3.getProjectName() + " projects.");

        System.out.println("Employee Name:"+employee1.getEmpName());
        System.out.println("Works In Department:"+department1.getDeptName());
        System.out.println("Project Assigned are:"+ project1.getProjectName()+" & "+ project2.getProjectName());
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Employee Name:"+employee2.getEmpName());
        System.out.println("Works In Department:"+department1.getDeptName());
        System.out.println("Project Assigned are:"+ project2.getProjectName()+" & "+ project3.getProjectName());


    }
}
