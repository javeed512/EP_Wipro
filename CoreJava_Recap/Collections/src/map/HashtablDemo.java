package map;

import java.util.Hashtable;
import java.util.Map;

public class HashtablDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new Hashtable<Integer, String>();

		map.put(103, "smith");
		map.put(102, "tom");
		map.put(104, "ford");
		map.put(101, "king");
		map.put(105, "javeed");
		map.put(45, "ravi");
		map.put(102, "jerry");
		map.put(106, "king");
		
		System.out.println(map);
		

	}

}
