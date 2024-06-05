package completablefuture;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 5, 7, 4, 1, 8, 2, 3);

		Stream<Integer> stream = list.stream();

		// stream.forEach((n1)->{ System.out.println(n1); });

		// stream.filter( (num1)->{ return num1 > 5; } ).forEach(
		// (num1)->{System.out.println(num1);});

		// stream.distinct().forEach(System.out::println);

		// stream.skip(4).forEach(System.out::println);

		// long count = stream.count();

		// System.out.println("Total elements count : "+count);

	//	Integer maxValue = stream.max(Comparator.comparing(Integer::valueOf)).get();

		//System.out.println("max value " + maxValue);

		Integer minValue = stream.min(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("min value " + minValue);

		List<String> list2 = Arrays.asList("tom", "javeed", "narayana", "himanshu sharma");

		Stream<String> stream2 = list2.stream();

		/*
		 * stream2.map((name) -> { System.out.println(name); return name.length();
		 * }).forEach((n1) -> { System.out.println(n1); });
		 */
		
	List<Integer>  list3 =	stream2.map((name) -> {
			System.out.println(name);
			return name.length();
		}).collect(Collectors.toList());
	
			System.out.println(list3);
		
		
		

	}

}
