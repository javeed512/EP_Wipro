package queue;

import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingPQDemo {

	public static void main(String[] args) {


PriorityBlockingQueue<String>  pbQue = new PriorityBlockingQueue<String>();


			pbQue.offer("Brown");
			pbQue.offer("Don");
			pbQue.offer("Adam");
			pbQue.offer("Charly");
			pbQue.offer("Ford");
			pbQue.offer("Don");
			//pbQue.offer(null);	  // null not allowed
			
		System.out.println(pbQue);
		
		
		
		 Vector<Integer> v = new Vector<Integer>(); 
	        v.addElement(1); 
	        v.addElement(5); 
	        v.addElement(2); 
	        v.addElement(3); 
	        v.addElement(4); 
	 
	        
	        PriorityBlockingQueue<Integer>  pbq = 
	        		new PriorityBlockingQueue<Integer>(v);
	        
	        System.out.println(pbq);
	        
		
	        	

	}

}
