package com.threads;

public class ThreadDemo {

	public static void main(String[] args) { // main-thread or JVM's thread or Daemon thread

		int x;

		String s;

		
		m1();
		
		for (int i = 0; i < 5; i++) {

			System.out.println("Main Thread " + i);

		}

	

	}



	public static void m1() { // child thread

		for (int i = 0; i < 5; i++) {

			System.out.println("Child Thread " + i);

		}

	}

}
