package com.wipro.springxml;

public class Student {

	private int sid;
	private String sname;

	public Student() {
		super();
		
		System.out.println("Student() called object created by IOC");
	}

	public Student(int sid, String sname) {
		super();
		
		System.out.println("Student(sid,sname) called , constructor DI used");
		
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
		
		System.out.println("setSid() is called");
		
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
		
		System.out.println("setSname() is called");
		
		
	}

}
