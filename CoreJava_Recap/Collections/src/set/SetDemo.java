package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {


			//Set<String>  set = new HashSet<String>();
		Set<String>  set = new LinkedHashSet<String>();
			
					set.add("B");
					set.add("C");
					System.out.println(set.add("A"));
					set.add("E");
					set.add("D");
					set.add("Javeed");
					System.out.println(set.add("A"));
					set.add(null);
					
					System.out.println(set);
					
					
					Set<Integer>  set2 = new HashSet<Integer>();
					
					set2.add(4);
					set2.add(325);
					set2.add(2);
					set2.add(55);
					set2.add(1);
					set2.add(6);
					
					System.out.println(set2);
		

	}

}
