package com.spiringcore.spel;

import com.spiringcore.lifecycle.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spel.xml");

        Demo demo1=(Demo)context.getBean("demo",Demo.class);
        System.out.println(demo1);

//        SpelExpressionParser temp=new SpelExpressionParser();
//        Expression expression=temp.parseExpression("220+55");
//        System.out.println(expression.getValue());

    }
}
