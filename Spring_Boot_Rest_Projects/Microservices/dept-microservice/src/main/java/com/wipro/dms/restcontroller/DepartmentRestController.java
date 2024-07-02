package com.wipro.dms.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dms.dto.DepartmentDTO;
import com.wipro.dms.dto.DeptEmpVO;
import com.wipro.dms.dto.Employee;
import com.wipro.dms.entities.Department;
import com.wipro.dms.service.IDepartmentService;

@RestController
@RequestMapping("/api/dept")
public class DepartmentRestController {

	@Autowired
	IDepartmentService service;

	@PostMapping(value = "/add")
	public Department addDept(@RequestBody DepartmentDTO dto) {

		return service.addDepartment(dto);
	}
	
	@GetMapping("/getall")
	public List<Department>  getAllDepts(){
		
		return service.getAllDepts();
		
	}
	
	@GetMapping("/getbydno/{dno}")
	public  Department  getDeptByNo(@PathVariable long dno) {
		
		return service.getDeptByNo(dno);
	}
	
	
	@GetMapping("/getdeptemp/{dno}")
	public  DeptEmpVO  getDeptAndEmp(@PathVariable  long dno) {
		
		 DeptEmpVO  deptEmp = service.getDeptAndEmp(dno);
		 
		 System.out.println(deptEmp);
		 
		 return deptEmp;
		
		
	}
	
	@PutMapping("/emp-update")
	public   String   updateEmployeeFromDept(@RequestBody Employee emp) {
		
		return service.updateEmployeeFromDept(emp);
		
	}
	
	
	
	
	

}
