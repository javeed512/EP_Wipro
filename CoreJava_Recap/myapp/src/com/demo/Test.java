package com.demo;

public class Test {

	public static void main(String[] args) {


		Employee e1  =	 new  Employee(101,"King",50000);
		
		System.out.println(e1);
		
			
		
			//System.out.println(e1.eid +"  "+e1.ename+"  "+e1.salary);
		
		
			
			Employee e2  =	 new  Employee(102, "Smith", 40000);

			//System.out.println(e2.eid +"  "+e2.ename+"  "+e2.salary);
		
			//Employee e3 = new Employee(0,"javeed",0.0);
			 // Employee e3 = new Employee();
			 // e3.setEname("Javeed");
			 
			  System.out.println(e1.getEid() + " "+ e1.getEname() +" "+e1.getSalary());
			 
			  
				
				System.out.println(e2.getEid() + " "+ e2.getEname() +" "+e2.getSalary());
				
			  
			 // System.out.println(e3.getEid() + " "+ e3.getEname() +" "+e3.getSalary()); 
			
			
	}

}
