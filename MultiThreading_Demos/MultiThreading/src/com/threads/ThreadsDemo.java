package com.threads;

public class ThreadsDemo extends Thread{ //IS A Relationship

	public static void main(String[] args) {  // main thread


			ThreadsDemo t1 = new ThreadsDemo();
			
			ThreadsDemo t2 = new ThreadsDemo();
					//t1.setPriority(MAX_PRIORITY-2);
			
			t1.setPriority(5);
			
			t1.setName("Virat");
			
			System.out.println(t1);
			
			t2.setPriority(5);
			t2.setName("Dhoni");
			
			
			System.out.println(t2);
			
			t1.start();
			
			t2.start();
			
			
			
		
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName() +" "+i );
			
		}
		
		
	}
	

}
