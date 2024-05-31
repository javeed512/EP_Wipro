package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {


		  Map<Customer,String> map = 
				  new  TreeMap<Customer,String>(new CustomerComparator());
		
		  	map.put(new Customer(21, "King"), "Hyderabad");
		  	map.put(new Customer(24, "Smith"), "Pune");
		  	map.put(new Customer(56, "Ford"), "Chennai");
		  	map.put(new Customer(99, "Javeed"), "Delhi");
		  	map.put(new Customer(33, "Ravi"), "Banglore");
			
		  	
		  	System.out.println(map);
		

	}

}
