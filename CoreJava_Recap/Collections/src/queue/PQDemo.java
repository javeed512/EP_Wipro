package queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		PriorityQueue<String>  que = new PriorityQueue<String>(new StringComparator());
		
				que.offer("D");
				que.offer("A");
				que.offer("C");
				que.offer("E");
				que.offer("B");
				que.offer("Javeed");
				//que.offer(null);
				que.offer("A");
				
		
				System.out.println(que);
				
				Object[]  str = que.toArray();
				
				
				Arrays.sort(str);
				
			 
				for(int i=0; i<str.length;i++) {
					
					System.out.print(str[i] +" ");
					
				}
				
				System.out.println();
				
				
					Iterator<String> it = 	que.iterator();
					
					while (it.hasNext()) {
						String s = it.next();
						
						System.out.println(s);
						
					}
				
				
		
	}

}
