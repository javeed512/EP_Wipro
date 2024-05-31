package set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

	public static void main(String[] args) {


		Set<Employee>  set  = new HashSet<Employee>();
		
		
		set.add(new Employee(101, "king", 5000));
		set.add(new Employee(103, "tom", 4000));
		set.add(new Employee(104, "smith", 7000));
		set.add(new Employee(102, "ravi", 3000));
		set.add(new Employee(105, "ford", 6000));
		
	
		System.out.println(set);
		
		
		
	}

}
