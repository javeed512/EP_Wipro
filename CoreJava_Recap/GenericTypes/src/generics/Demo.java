package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	
		public static void methodOne(ArrayList<?> al) {
			
			
			//al.add("javeed");
			
			System.out.println(al);
			
		}
	

	public static void main(String[] args) {


			Test1<Integer>  t1 = new Test1<Integer>();
		
		
			Test<ArrayList>  t2 = new Test<ArrayList>();
			
			Test1<Double>  t3 = new Test1<Double>();
		

			TestDemo<String>  td = new TestDemo<String>();	
			
			
			ArrayList<String>  al = new ArrayList<String>();
			
			al.add("king") ;   al.add("tom");  al.add(null); 
			
			  
			
			methodOne(al);
			
	}

}

class TestDemo<T>{
	
	
}

class Test1<T extends Number> {
	
	
}



class Test<T extends List>{
		
}



