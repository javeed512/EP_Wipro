package com.wipro.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.entities.Employee;
import com.wipro.restapi.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;

	@GetMapping("/getall")
	public List<Employee> getAll() {

		return  service.getAllEmployees();

	}

	@GetMapping("/getbyid/{eid}")
	public Employee getById(@PathVariable int eid) {

		return   service.getEmployeeById(eid);

	}
	
	
	@GetMapping("/getbyename/{ename}")
	public Employee  getByEname(@PathVariable String ename) {
		
				return service.getByEname(ename);
		
	}
	
	
	
	@GetMapping("/getbysalary/gt/{salary}")
	public List<Employee> getByGTSalary(@PathVariable double salary) {

		return  service.getByGTSalary(salary);

	}
	
	
	
	@GetMapping("/getallsorted")
	public List<Employee> getAllSorted() {

		return  service.getAllSorted();

	}

	
	

	@PostMapping(name="/add",consumes = "application/json",produces = "application/json")
	public Employee add(@RequestBody Employee emp) {
		
		
		return  service.addEmployee(emp);

	}

	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {

		return  service.updateEmployee(emp);

	}

	@DeleteMapping("/deletebyid/{eid}")
	public String delete(@PathVariable int eid) {

		return   service.deleteEmployeeById(eid);

	}

}
