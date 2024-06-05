package com.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsRunnableDemo {

	public static void main(String[] args) {

		Runnable runnableTask = () -> {

			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println("Current Time :  " + LocalDateTime.now());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		};
		
		
		//ExecutorService executorService		Executors.newSingleThreadExecutor();
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		
		  //1. execute task using execute() method
		executorService.execute(runnableTask);
		
		
		   //2. execute task using submit() method
	    Future<String> result = executorService.submit(runnableTask, "DONE");
	    
	    
	    while(result.isDone() == false) 
	    {
	      try
	      {
	        System.out.println("The method return value : " + result.get());
	        break;
	      } 
	      catch (InterruptedException | ExecutionException e) 
	      {
	        e.printStackTrace();
	      }
	       
	    
	    }
	    
	    
	    
	    //Sleep for 1 second
	      try {
	        Thread.sleep(1000L);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    
	     
	    //Shut down the executor service
	      executorService.shutdownNow();
	    

	}

}
