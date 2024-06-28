package com.wipro.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wipro.springboot.entity.Employee;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SpringbootApplication.class, args);
	
			Employee e1 =	context.getBean("e1", Employee.class);
	
			//System.out.println(e1);
	
	}

}
