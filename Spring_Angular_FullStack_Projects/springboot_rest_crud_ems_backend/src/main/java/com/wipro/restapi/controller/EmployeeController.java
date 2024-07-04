package com.wipro.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.entities.Employee;
import com.wipro.restapi.exceptions.EmployeeNotFoundException;
import com.wipro.restapi.service.IEmployeeService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/employees")

public class EmployeeController {

	@Autowired
	IEmployeeService service;

	@GetMapping("/getall")
	public List<Employee> getAll() {

		return service.getAllEmployees();

	}

	@GetMapping("/getbyid/{eid}")
	public Employee getById(@PathVariable int eid) throws EmployeeNotFoundException {

		Employee emp = service.getEmployeeById(eid);

		if (emp == null) {

			throw new EmployeeNotFoundException();

		}

		return emp;

	}

	/*
	 * @ResponseStatus(reason = "Employee Not Found in DB",code =
	 * HttpStatus.NOT_FOUND)
	 * 
	 * @ExceptionHandler(value = {EmployeeNotFoundException.class}) public void
	 * handleException(EmployeeNotFoundException e) {
	 * 
	 * System.out.println(e);
	 * 
	 * }
	 */

	@GetMapping("/getbyename/{ename}")
	public Employee getByEname(@PathVariable String ename) {

		return service.getByEname(ename);

	}

	@GetMapping("/getbysalary/gt/{salary}")
	public List<Employee> getByGTSalary(@PathVariable double salary) {

		return service.getByGTSalary(salary);

	}

	@GetMapping("/getallsorted")
	public List<Employee> getAllSorted() {

		return service.getAllSorted();

	}

	@GetMapping("/getbysalaryrange/{min}/{max}")
	public List<Employee> getAllEmployeesBySalaryRange(@PathVariable double min, @PathVariable double max) {

		return service.getAllEmployeesBySalaryRange(min, max);

	}

	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp) {

		System.out.println("Controller "+emp);

		return service.addEmployee(emp);

	}

	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {

		return service.updateEmployee(emp);

	}

	@DeleteMapping("/deletebyid/{eid}")
	public String delete(@PathVariable int eid) {

		return service.deleteEmployeeById(eid);

	}

	@DeleteMapping("/deletebyename/{ename}")
	public ResponseEntity<String> deleteByEname(@PathVariable String ename) {

		service.deleteByEname(ename);

		return new ResponseEntity<String>("Record Deleted ", HttpStatus.ACCEPTED);

	}

}
