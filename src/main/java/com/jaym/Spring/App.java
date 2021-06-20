package com.jaym.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("./resources/spring.xml");
        
        
        
        Car obj = (Car)context.getBean("car");
        obj.drive();
        
//        Tyre t = (Tyre)context.getBean("tyre");
//        System.out.println(t);
        
        ((AbstractApplicationContext) context).close();
    }
}

