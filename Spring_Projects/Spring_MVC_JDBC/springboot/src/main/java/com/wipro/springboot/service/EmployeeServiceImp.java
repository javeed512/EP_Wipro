package com.wipro.springboot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springboot.entity.Employee;
import com.wipro.springboot.repository.EmployeeDaoImp;
import com.wipro.springboot.repository.IEmployeeDao;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	private  IEmployeeDao dao;
	
	
	
	
	
	@Override
	public int addEmployee(Employee emp) throws SQLException {
		
		
		return   dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) throws SQLException {

		return  dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployee(int eid) throws SQLException {

		return dao.deleteEmployee(eid);
	}

	@Override
	public Employee getEmployeeById(int eid) throws SQLException {

		return dao.getEmployeeById(eid);
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		return dao.getAllEmployees();
	}

}
