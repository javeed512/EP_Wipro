package set;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {


		
		Set<Employee>  set  = new TreeSet<Employee>(new MyComparator());
		
		
			set.add(new Employee(101, "king", 5000));
			set.add(new Employee(103, "tom", 4000));
			set.add(new Employee(104, "smith", 7000));
			set.add(new Employee(102, "ravi", 3000));
			set.add(new Employee(105, "ford", 6000));
			
		
			System.out.println(set);

	}

}
