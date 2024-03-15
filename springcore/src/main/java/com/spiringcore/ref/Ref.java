//package com.sprigcore.ref;
//
//import com.sprigcore.ref.A;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Ref {
//    public static void main(String[] args) {
//        System.out.println( "Hello World!" );
//
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        A temp=(A) context.getBean("aref");
//        System.out.println(temp.getX());
//
//        System.out.println(temp.getOb().getY());
//        System.out.println(temp);
//
//    }
//}
package com.spiringcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ref {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("refer.xml");
        A temp = (A) context.getBean("aref");

        System.out.println("Value of 'x': " + temp.getX());
        System.out.println("Value of 'y' (from B): " + temp.getOb().getY());
        System.out.println("A object details: " + temp);
    }
}
