package com.spiringcore.sapphireassignment;

import java.util.*;

public class TestApplicationBean {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);



        System.out.println("\n--------Project In Application Context----------------\n");
        char ch='T';
        do{
            try {
                System.out.println("1.View Employee Details\n2.View Departments Details\n3.View Projects Detail\n4.Exit\nEnter Selection:");
                int mainSel = ob.nextInt();

                if (mainSel == 1) {
                    char d = 'T';
                    do {
                        try {
                            System.out.println("1.GetAllEmployeesFullDetail\n2.GetDepartmentName\n3.getProjectName\n4.Back\nEnter Selection:");
                            int empSel = ob.nextInt();
                            DaoEmployee dAB = new DaoEmployee();
                            switch (empSel) {
                                case 1:
                                    dAB.getAllEmployeesFullDetail();
                                    System.out.println("-----------GetAllEmployeesFullDetail----------------------\n");
                                    break;
                                case 2:
                                    dAB.getDepartmentName();
                                    System.out.println("-----------------GetDepartmentName-----------------------------\n");
                                    break;
                                case 3:
                                    dAB.getProjectName();
                                    System.out.println("-------------------getProjectsName-----------------------\n");
                                    break;
                                case 4:
                                    d = 'F';
                                    break;
                                default:
                                    System.out.println("Invalid Selection\n");
                                    break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("Input MisMatch\n");
                            ob.nextLine(); // Consume the invalid input
                        }
                    } while (d == 'T');
                }//end main sel 1 Employees if


                if (mainSel == 2) {
                    char e = 'T';
                    do {
                        try {
                            System.out.println("1.GetAllDepartmentsFullDetail\n2.GetEmployeesName\n3.getProjectsName\n4.Back\nEnter Selection:");
                            int empSel = ob.nextInt();
                            DaoDepartment daoDept = new DaoDepartment();

                            switch (empSel) {
                                case 1:
                                    daoDept.GetAllDepartmentsFullDetail();
                                    System.out.println("-----------------GetAllDepartmentFullDetail---------------------\n");
                                    break;
                                case 2:
                                    daoDept.getEmployees();
                                    System.out.println("-------------------------GetEmployeesName------------------------\n");
                                    break;
                                case 3:
                                    daoDept.getProjects();
                                    System.out.println("--------------------------getProjectsName-------------------------\n");
                                    break;
                                case 4:
                                    e = 'F';
                                    break;
                                default:
                                    System.out.println("Invalid Selection\n");
                                    break;

                            }
                        } catch (Exception g) {
                            g.printStackTrace();
                            System.out.println("Input MisMatch\n");
                            ob.nextLine(); // Consume the invalid input
                        }
                    } while (e == 'T');
                }//end Department  if
                if (mainSel == 3) {
                    char g = 'T';
                    do {
                        try{
                        System.out.println("1.GetProjectsFullDetail\n2.GetEmployeesName\n3.Back\nEnter Selection:");
                        int empSel = ob.nextInt();
                        DaoProject daoProject = new DaoProject();
                        switch (empSel) {
                            case 1:
                                daoProject.getAllProjectsFullDetail();
                                System.out.println("--------------------GetAllProjectsFullDetail-----------------------\n");
                                break;
                            case 2:
                                daoProject.getEmployeesName();
                                System.out.println("------------------------GetEmployeesName--------------------------------\n");
                                break;
                            case 3:
                                g = 'F';
                                break;
                            default:
                                System.out.println("Invalid Selection\n");
                                break;
                        }
                        } catch (Exception h) {
                            h.printStackTrace();
                            System.out.println("Input MisMatch\n");
                            ob.nextLine(); // Consume the invalid input
                        }
                    } while (g == 'T');
                }//end projects if

                if (mainSel == 4) {
                    System.out.println("Good Bye");
                    System.exit(0);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input Mismatch. Please enter a valid numeric choice. main");
               ob.nextLine(); // Consume the invalid input
            }finally {

                System.out.println("Program Working");
            }
        }while(ch=='T');


    }
}


