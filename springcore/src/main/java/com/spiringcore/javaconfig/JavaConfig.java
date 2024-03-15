package com.spiringcore.javaconfig;



import com.spiringcore.lifecycle.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }


    @Bean(name = {"student","temp","con"}  )
    public Student getStudent(){
        //creating a new Student Object
        Student student=new Student(getSamosa());
        return student;
    }
}
