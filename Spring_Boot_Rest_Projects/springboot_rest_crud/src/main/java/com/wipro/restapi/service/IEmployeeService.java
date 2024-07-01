package com.wipro.restapi.service;

import java.util.List;

import com.wipro.restapi.entities.Employee;

public interface IEmployeeService {
	
		
		public  Employee    addEmployee(Employee employee);
		public  Employee    updateEmployee(Employee employee);
		
		
		public  Employee  getEmployeeById(int eid);
		public  String deleteEmployeeById(int eid);
		
		
		public   List<Employee>   getAllEmployees();
	
	

}
