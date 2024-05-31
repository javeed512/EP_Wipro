package queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {


		ArrayDeque<String> animals= new ArrayDeque<String>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");
        
      //  animals.add(null);

        // Using addLast()
        animals.addLast("Horse");
        
        
        
        
      
        
        System.out.println("ArrayDeque: " + animals);
		
		
	}

}
