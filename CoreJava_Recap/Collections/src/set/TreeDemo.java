package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {


		Set<String> set = new  TreeSet<String>(new StringComparator());
		
		
					set.add("Ford");
					set.add("Smith");
					set.add("Adam");
					set.add("Don");
					set.add("Brown");
					
					
					System.out.println(set);
					

					Set<Integer>  set2 = new TreeSet<Integer>();
					
					set2.add(4);
					set2.add(325);
					set2.add(2);
					set2.add(55);
					set2.add(1);
					set2.add(6);
					
					System.out.println(set2);	
					
					

	}

}
