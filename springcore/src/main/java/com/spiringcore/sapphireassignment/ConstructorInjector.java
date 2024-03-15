package com.spiringcore.sapphireassignment;
import java.util.*;
public class ConstructorInjector {
        public static void main(String[] args) {

            Department department1 = new Department(1, "SOFTWARE ENGINEERING");
            Project project1 = new Project(1, "LIBRARY");
            Project project2 = new Project(2, "HOSPITAL");

            Employee employee1 = new Employee(1, "UZAIR", department1, Arrays.asList(project1, project2));

            Department department2 = new Department(2, "TELECOM");
            Project project3 = new Project(2, "HOSPITAL");
            Project project4 = new Project(3, "ADMISSION");

            Employee employee2 = new Employee(2, "ARSLAN", department2, Arrays.asList(project3, project4));

            System.out.println(employee1);
            System.out.println(employee2);

        }
    }
