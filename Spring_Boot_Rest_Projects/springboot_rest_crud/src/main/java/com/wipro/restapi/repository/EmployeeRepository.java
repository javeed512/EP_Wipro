package com.wipro.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.entities.Employee;

@Repository
public interface EmployeeRepository  extends  JpaRepository<Employee,Integer> {
	
	// select e from Employee e where  e.ename = ?;
		public  Employee   findByEname(String ename);
		
		// select * from Employee_Info where  salary > ?;	
		
		public List<Employee> findBySalaryGreaterThan(double salary);
		
		
					
					
		
		

}
