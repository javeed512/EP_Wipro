package com.wipro.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.wipro.ems.dao.EmployeeDaoImp;
import com.wipro.ems.dao.IEmployeeDao;
import com.wipro.ems.entity.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	private  IEmployeeDao dao;
	
	public EmployeeServiceImp() {
		
		dao= new EmployeeDaoImp();
		
	}
	
	
	
	@Override
	public int addEmployee(Employee emp) throws SQLException {

		return   dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {

		return  dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployee(int eid) {

		return dao.deleteEmployee(eid);
	}

	@Override
	public Employee getEmployeeById(int eid) {

		return dao.getEmployeeById(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

}
