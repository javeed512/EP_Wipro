package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		// Map<Integer,String> map = new HashMap<Integer,String>();

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(103, "smith");
		map.put(102, "tom");
		map.put(104, "ford");
		map.put(101, "king");
		map.put(105, "javeed");
		map.put(45, "ravi");
		map.put(102, "jerry");
		map.put(106, "king");

		System.out.println(map);

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> it = keySet.iterator();

		
			while (it.hasNext()) {
				Integer key =  it.next();
				
				System.out.println(key +"  "+ map.get(key));
				
			}
		
			System.out.println("for each retrieve all values");
			
			for(Integer k:keySet) {
				
				System.out.println(map.get(k));
				
			}
			
			System.out.println(map.values());
			
		
	}

}
