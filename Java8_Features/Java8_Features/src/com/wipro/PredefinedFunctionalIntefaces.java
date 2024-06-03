package com.wipro;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredefinedFunctionalIntefaces {

	
		public static void main(String[] args) {
			
		
	
	Predicate<Integer> predicate = (Integer num)-> {return num%2 == 0;};
	
	
			System.out.println(predicate.test(4));
			
			
			
//Consumer<String> consumer =(String name)-> {System.out.println(name);  };
			
						Consumer<String> consumer = System.out::println;
		                                    
		                                    
		                    consumer.accept("Javeed");    
		                    
		                    
		                    
	
		}
		
}
