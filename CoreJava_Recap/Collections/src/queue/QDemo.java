package queue;

import java.util.PriorityQueue;

public class QDemo {

	public static void main(String[] args) {


		PriorityQueue<Integer>  que = new PriorityQueue<Integer>();
		
				System.out.println("Is Empty "+que.isEmpty());
				System.out.println(que.peek());
				//System.out.println(que.element());
		
				for (int i = 0; i < 5; i++) {
				
						que.offer(i);
					
				}
				
				System.out.println(que);
				System.out.println("Poll/delete head element "+que.poll());
				System.out.println("Read Head element "+que.peek());
				
				
	 			
				
				
				
	}

}
