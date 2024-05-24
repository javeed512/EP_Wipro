package com.demo;

import java.lang.*;

public class Employee extends Object {

	private  static  int eid;
	private  static  String ename;
	private  static   double salary;
	
	
	public Employee() {
		super();
	}
	

	public Employee(int eid, String ename, double salary) {
		super(); // Object();

		this.eid = eid;
		this.ename = ename;
		this.salary = salary;

	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
	
	
	
	
	
}
