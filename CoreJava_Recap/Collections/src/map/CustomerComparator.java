package map;

import java.util.Comparator;

public class CustomerComparator 
                   implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		String s1 = c1.toString();
		String s2 = c2.toString();

		return s1.compareTo(s2);
	}

}
