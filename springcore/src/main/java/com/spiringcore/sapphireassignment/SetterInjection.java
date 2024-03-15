package com.spiringcore.sapphireassignment;
import  java.util.*;
public class SetterInjection {
        public static void main(String[] args) {
            Employee employee1 = new Employee();
            Employee employee2 = new Employee();

            employee1.setEmpId(1);
            employee1.setEmpName("Hamid");

            employee2.setEmpId(2);
            employee2.setEmpName("ARSLAN");

            Department department1 = new Department();
            department1.setDeptId(1);
            department1.setDeptName("ELECTRONICS");

            Project project1 = new Project();
            project1.setProjectId(1);
            project1.setProjectName("USINDH");

            Project project2 = new Project();
            project2.setProjectId(2);
            project2.setProjectName("LIBRARY");

            Project project3 = new Project();
            project3.setProjectId(3);
            project3.setProjectName("HOSPITAL");

            employee1.setDepartment(department1);
            employee1.setProject(Arrays.asList(project1, project2));

            employee2.setDepartment(department1);
            employee2.setProject(Arrays.asList(project2, project3));

//            System.out.println(employee1.getEmpName() + " works in the " + department1.getDeptName() + " department and is assigned to the " + project1.getProjectName() + " and " + project2.getProjectName() + " projects.");
//            System.out.println(employee2.getEmpName() + " works in the " + department1.getDeptName() + " department and is assigned to the " + project2.getProjectName() + " and " + project3.getProjectName() + " projects.");



            System.out.println("Employee Name:"+employee1.getEmpName());
            System.out.println("Works In Department:"+department1.getDeptName());
            System.out.println("Project Assigned are:"+ project1.getProjectName()+" & "+ project2.getProjectName());
            System.out.println("\n------------------------------------------------------------------------\n");
            System.out.println("Employee Name:"+employee2.getEmpName());
            System.out.println("Works In Department:"+department1.getDeptName());
            System.out.println("Project Assigned are:"+ project2.getProjectName()+" & "+ project3.getProjectName());
        }
    }


