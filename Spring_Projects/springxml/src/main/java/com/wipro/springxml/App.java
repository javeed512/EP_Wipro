package com.wipro.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
  // XmlBeanFactory  xmlContainer = new XmlBeanFactory(new ClassPathResource("resources/application.xml"));
    		
    	//	Student student = (Student)	xmlContainer.getBean("s1");
    	
  ApplicationContext context =  	new ClassPathXmlApplicationContext("resources/application.xml");
  
  				Student student =		context.getBean("s1", Student.class);
    		
    		System.out.println(student);
    		
    		System.out.println(student.getSid());
    	
    		System.out.println(student.getSname());
    		
    		
    	Student student2 =			context.getBean("s2",Student.class);
    		
    			System.out.println(student2);
    			
    			System.out.println(student2.getSid() +"  "+student2.getSname());
    		
    		
    }
}
