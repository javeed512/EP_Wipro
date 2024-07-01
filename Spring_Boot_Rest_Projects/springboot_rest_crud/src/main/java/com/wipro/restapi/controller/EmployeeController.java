package com.wipro.restapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.entities.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping("/getall")
	public String getAll() {

		return "Employee Details Fetched";

	}

	@GetMapping("/getbyid/{eid}")
	public String getById(@PathVariable int eid) {

		return "Employee Fetch By Id "+eid;

	}

	@PostMapping("/add")
	public String add(@RequestBody Employee emp) {
		
		
		return "Employee Added "+emp;

	}

	@PutMapping("/update")
	public String update(@RequestBody Employee emp) {

		return "Employee Data updated "+emp;

	}

	@DeleteMapping("/deletebyid/{eid}")
	public String delete(@PathVariable int eid) {

		return "Employee Deleted for "+eid;

	}

}
