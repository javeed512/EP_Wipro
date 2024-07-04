package com.wipro.restapi.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wipro.restapi.entities.Employee;
import com.wipro.restapi.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	Logger  logger =LoggerFactory.getLogger(EmployeeServiceImp.class);
	

	@Override
	public Employee addEmployee(Employee employee) {
		
			logger.info("EmpService "+employee);
		
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int eid) {
	
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteEmployeeById(int eid) {
	
		 repo.deleteById(eid);
		 
		 return "Record Deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {


		return repo.findAll();
	}

	@Override
	public Employee getByEname(String ename) {


		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getByGTSalary(double salary) {
	
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAllSorted() {
	
		return repo.findAll(Sort.by("salary"));
		
	  	//repo.findAll(Sort.by(Order.desc("ename")));
	}

	@Override
	public List<Employee> getAllEmployeesBySalaryRange(double min, double max) {
		
		return  repo.getAllEmployeesBySalaryRange(min, max);
	}

	
	@Override
	public void deleteByEname(String ename) {

			repo.deleteByEname(ename);
		
		
	}

}
