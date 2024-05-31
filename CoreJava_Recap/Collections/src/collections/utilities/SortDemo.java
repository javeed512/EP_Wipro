package collections.utilities;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();

		list.add(5);// new Integer(5);
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(1);

		System.out.println(list);

	


		Collections.sort(list);
		System.out.println("Sorted " + list);

		int index = Collections.binarySearch(list, 4);
		

		System.out.println(index);
		
		Collections.reverse(list);
		
		
		

		System.out.println("Reverse " + list);

		Object[] arr = list.toArray(); // convert list to array

		List<Object> newList =	Arrays.asList(arr);
		
		
	}

}
