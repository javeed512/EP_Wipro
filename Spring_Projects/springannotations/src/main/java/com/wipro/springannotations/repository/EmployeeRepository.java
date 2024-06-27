package com.wipro.springannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	
		public EmployeeRepository() {
			
			System.out.println("IOC created EmpRepo obj");
			
		}
	
	
	
	 public void getRepo() {
		 
		 
		 System.out.println("repo executed");
		 
	 }

}
