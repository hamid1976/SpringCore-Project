package com.spiringcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println( "Hello World!" );

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Emp emp1=(Emp) context.getBean("emp1");


        System.out.println("Simple Name");
        System.out.println(emp1.getName());

        System.out.println("List of Phone Numbers");
        System.out.println(emp1.getPhones());

        System.out.println("Set Of Addresses");
        System.out.println(emp1.getAdresses());

        System.out.println("Map of Courses");
        System.out.println(emp1.getCourses());

        System.out.println("Get Props");
        System.out.println(emp1.getProps());

        System.out.println(emp1.getPhones().getClass().getName());
    }
}
