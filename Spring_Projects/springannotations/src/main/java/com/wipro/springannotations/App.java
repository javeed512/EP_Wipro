package com.wipro.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.springannotations.beans.Employee;
import com.wipro.springannotations.service.EmployeeService;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = "com.wipro.springannotations.*")
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Employee emp = context.getBean(Employee.class);

		System.out.println(emp);

		emp.setEid(101);
		emp.setEname("king");
		emp.setSalary(9000);

		System.out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getSalary());

		Employee e1 = context.getBean("e1", Employee.class);

		System.out.println(e1);
		
		
			EmployeeService service =		context.getBean(EmployeeService.class);
			
			service.getService();
		
		
	}
}
