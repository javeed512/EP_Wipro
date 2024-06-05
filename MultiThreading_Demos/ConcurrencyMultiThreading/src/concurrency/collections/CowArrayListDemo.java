package concurrency.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CowArrayListDemo {

	public static void main(String[] args) {


		List<String> list = Arrays.asList("CV Raman", "Homi Bhabha", "Ramanujan");
		CopyOnWriteArrayList<String> cowArrayList = new CopyOnWriteArrayList<String>(list);

		System.out.println("List = " + cowArrayList);

		Iterator<String> iterator1 = cowArrayList.iterator();

		// adding another element
		cowArrayList.add("Vikram Sarabhai");
		
		cowArrayList.add("Javeed");
		
		cowArrayList.add("Javeed");

		while(iterator1.hasNext()) {
			System.out.println("Element from iterator1 : " + iterator1.next());
		}

		
		
		
	Iterator<String> iterator2 = cowArrayList.iterator();
	
	
		
		while(iterator2.hasNext()) {
			System.out.println("Element from iterator2 : " + iterator2.next());
		}
		
		
				
				
				
		
		
	}

}
