package com.wipro.restapi.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "Employee_Info")
public class Employee {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column(name = "emp_name")
	@NotNull
	@NotBlank
	@Pattern(regexp = "[A-Z][a-z]{4}")
	private String ename;
	
	@Min(value = 5000)
	@Max(value= 99000)
	private double salary;
	
	
	private LocalDate doj;
	
	//@Email
	//private String email;  // "javeed@gmail.com"

	public Employee() {

	}

	
	
	
	
	public Employee(int eid, String ename, double salary, LocalDate doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.doj = doj;
	}





	public LocalDate getDoj() {
		return doj;
	}





	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}





	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}





	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", doj=" + doj + "]";
	}


}
