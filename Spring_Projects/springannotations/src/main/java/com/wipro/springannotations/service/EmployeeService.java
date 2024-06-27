package com.wipro.springannotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springannotations.beans.Employee;
import com.wipro.springannotations.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
		@Autowired
private	EmployeeRepository repo ;
		
		@Autowired
		Employee emp;
		
		@Autowired
		Thread t1;
		
		
	public	void  getService() {
			
			
				System.out.println("Service got EmpRepo by autowiring");
				System.out.println(repo);
				
				repo.getRepo();
				
				
				System.out.println("emp obj in service" +emp);
			
		}
		
	

}
