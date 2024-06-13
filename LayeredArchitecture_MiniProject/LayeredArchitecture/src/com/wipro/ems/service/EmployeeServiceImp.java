package com.wipro.ems.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.wipro.ems.dao.EmployeeDaoImp;
import com.wipro.ems.dao.IEmployeeDao;
import com.wipro.ems.entity.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	private  IEmployeeDao dao;
	
	public EmployeeServiceImp() {
		
		dao= new EmployeeDaoImp();
		
	}
	
	Logger log =  Logger.getLogger(EmployeeServiceImp.class);
	
	@Override
	public int addEmployee(Employee emp) throws SQLException {
		
		log.info("add method from service ");
		
		log.warn("emp data adding to db");
		
		log.error("no error in add service");

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
