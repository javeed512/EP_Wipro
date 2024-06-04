package com.threads;

public class MyThread   implements Runnable {

	public static void main(String[] args) {
		
		
		Runnable runnable =		new MyThread();
		
		
		Thread  t = new Thread(runnable) ; // HAS A Relationship
		
				t.start();

	}

	@Override
	public void run() {


			System.out.println("run() is called and thread logic executed...");
		
	}

}
