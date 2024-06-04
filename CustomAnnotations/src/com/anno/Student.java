package com.anno;

import  static  java.lang.System.out;


@CustomAnnotation(msg=" using for type")
public class Student {

	
	@CustomAnnotation(msg=" using for field")
	String studentName;

	
	@CustomAnnotation(msg="using for constructor")
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(@CustomAnnotation(msg="using for param")  String studentName) {
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		
		
		out.println("one");
		out.println("two");
		out.println("three");
		out.println("four");

	}

}
