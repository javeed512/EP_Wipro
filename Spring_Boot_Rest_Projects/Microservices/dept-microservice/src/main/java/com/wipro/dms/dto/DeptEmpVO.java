package com.wipro.dms.dto;

import com.wipro.dms.entities.Department;

public class DeptEmpVO {
	
	
	private  Department dept;
	private  Employee emp;
	
	
	
	
	public DeptEmpVO() {
		super();
	}
	public DeptEmpVO(Department dept, Employee emp) {
		super();
		this.dept = dept;
		this.emp = emp;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	
	
	

}
