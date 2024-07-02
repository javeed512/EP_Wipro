package com.wipro.dms.service;

import java.util.List;

import com.wipro.dms.dto.DepartmentDTO;
import com.wipro.dms.dto.DeptEmpVO;
import com.wipro.dms.dto.Employee;
import com.wipro.dms.entities.Department;

public interface IDepartmentService {
	
	
	
		public  Department   addDepartment(DepartmentDTO dept);
		
		public Department    getDeptByNo(long dno);
		
		public  List<Department>  getAllDepts();
		
		
		public  DeptEmpVO   getDeptAndEmp(long dno);
		
		public  String updateEmployeeFromDept(Employee emp);
	

}
