package com.wipro.springboot.service;

import java.sql.SQLException;
import java.util.List;

import com.wipro.springboot.entity.Employee;

public interface IEmployeeService {

	public int addEmployee(Employee emp)  throws SQLException;

	public int updateEmployee(Employee emp)  throws SQLException;

	public int deleteEmployee(int eid)  throws SQLException;

	public Employee getEmployeeById(int eid)  throws SQLException;

	public List<Employee> getAllEmployees() throws SQLException;

}
