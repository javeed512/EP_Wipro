package com.wipro.restapi.service;

import java.util.List;

import com.wipro.restapi.entities.Employee;

public interface IEmployeeService {
	
		
		public  Employee    addEmployee(Employee employee);
		public  Employee    updateEmployee(Employee employee);
		
		
		public  Employee  getEmployeeById(int eid);
		public  String deleteEmployeeById(int eid);
		
		
		public   List<Employee>   getAllEmployees();
		
		
		public Employee   getByEname(String ename);
		
		
		public  List<Employee>  getByGTSalary(double salary);
		
		
		public  List<Employee> getAllSorted();
	
	
		public List<Employee>  	 getAllEmployeesBySalaryRange(double min,double max);
		
		public  void  deleteByEname(String ename);

}
