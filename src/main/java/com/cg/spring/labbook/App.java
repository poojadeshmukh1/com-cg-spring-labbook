package com.cg.spring.labbook;
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
        System.out.println( "start" );
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringLabbook.xml");
        Employee emp=context.getBean("employee",Employee.class);
        SBU sbu = context.getBean("sbu",SBU.class);
        System.out.println(emp.toString());
        System.out.println("End");
		((AbstractApplicationContext) context).close();
    }
}