package com.wipro.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.wipro.ems.entity.Employee;

public interface IEmployeeService {

	public int addEmployee(Employee emp)  throws SQLException;

	public int updateEmployee(Employee emp);

	public int deleteEmployee(int eid);

	public Employee getEmployeeById(int eid);

	public List<Employee> getAllEmployees();

}
