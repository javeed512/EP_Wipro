package com.wipro;

import java.util.function.Function;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {


	MyInterface mi	=	new DemoImp();
	
			System.out.println(mi.add(4, 5));
			
			mi.m2();
			
	MyInterface miObj	 = 	(int a, int b) -> { return  a+b;};  // lambda expression
					
		int result =	 miObj.add(10, 20);
	
		System.out.println("Result "+result);
		
				MyInterface.m1();
		
					mi.m2();
		
		
		Function<String, Employee> e1	=   Employee::new; // new Employee("King");
		
					e1.apply("king");
		
		Supplier<Employee>  e2 = Employee::new;	// new Employee();
	}

}
