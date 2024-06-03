package com.wipro;


@FunctionalInterface
public interface MyInterface {

	
	public abstract  int  add(int a, int b);
	
	
	
	 public static void  m1() {
		 
		 System.out.println("static method from interface is called");
		 
	 }
	
	 
	 public default void  m2() {
		 
		 System.out.println("default method from interface is called");
		 
	 }
	
	
}
