package com.wipro.ems.dao;

import java.sql.SQLException;
import java.util.List;

import com.wipro.ems.entity.Employee;

public interface IEmployeeDao {

	
	public int addEmployee(Employee emp) throws SQLException;

	public int updateEmployee(Employee emp) ;

	public int deleteEmployee(int eid);

	public Employee getEmployeeById(int eid);

	public List<Employee> getAllEmployees();
	
	
	
}
