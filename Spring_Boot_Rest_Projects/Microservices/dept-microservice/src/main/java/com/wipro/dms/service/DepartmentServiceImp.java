package com.wipro.dms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.dms.dto.DepartmentDTO;
import com.wipro.dms.dto.DeptEmpVO;
import com.wipro.dms.dto.Employee;
import com.wipro.dms.entities.Department;
import com.wipro.dms.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements IDepartmentService {

	@Autowired
	DepartmentRepository deptRepo;
	
	@Autowired
	RestTemplate  restTemplate;

	@Override
	public Department addDepartment(DepartmentDTO deptDTO) {

		Department dept = new Department();
		dept.setDname(deptDTO.getDname());
		dept.setLocation(deptDTO.getLocation());
		dept.setEid(deptDTO.getEid());

		return deptRepo.save(dept);
	}

	@Override
	public List<Department> getAllDepts() {


		return deptRepo.findAll();
	}
	
	@Override
	public Department getDeptByNo(long dno) {


		return deptRepo.findById(dno).orElse(null);
	}

	@Override
	public DeptEmpVO getDeptAndEmp(long dno) {


			Department dept =	getDeptByNo(dno);
			
				int eid = dept.getEid();
				
				System.out.println(dept);
		
				// here Employee microservice is invoked GET method by eid
		
	Employee emp=	restTemplate.getForObject("http://localhost:9090/api/employees/getbyid/"+eid, Employee.class);
				
				
			System.out.println(emp);
	
			DeptEmpVO   deptEmp = new DeptEmpVO();
			
			deptEmp.setDept(dept);
			deptEmp.setEmp(emp);
			
			return deptEmp;
			
			
	}

	@Override
	public String updateEmployeeFromDept(Employee emp) {


				// employee microservice to invoke  updateEmp();
		
				restTemplate.put("http://localhost:9090/api/employees/update", emp);
				
			
		
		
		return  "Emloyee updated from Dept microservice";
	}
	
	
	
	
	

	

}
