package list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

				Stack<Integer> stack = new Stack<Integer>();
				
			System.out.println("Is Empty ? "+stack.isEmpty());
			
			System.out.println("Size "+stack.size());
			
			stack.push(10);
			stack.push(20);
			stack.push(30);
			
			
			System.out.println(stack);
			
			System.out.println("Read top element "+stack.peek());
			
			System.out.println("Remove top element "+stack.pop());
			
			System.out.println("Read top element "+stack.peek());
	}

}
