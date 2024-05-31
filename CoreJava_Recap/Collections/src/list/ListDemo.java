package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {


		
		/*// ArrayList Demo
		 * List<Object> list = new ArrayList<Object>();
		 * 
		 * list.add(5);// new Integer(5); System.out.println(list.add(4)); list.add(2);
		 * list.add(7); list.add(1); System.out.println(list.add(4)); list.add(null);
		 * list.add("javeed"); list.add(4.555);
		 * 
		 * System.out.println(list);
		 */
			
			
		List<Integer>  list = new LinkedList<Integer>(); 

	
		
			list.add(5);// new Integer(5);
			System.out.println(list.add(4));
			list.add(2);
			list.add(7);
			list.add(1);
			System.out.println(list.add(4));
			//list.add(null);
			//list.add("javeed");
			//list.add(4.555);
			
			System.out.println(list);
			
			
				
			Iterator<Integer> it =	list.iterator();
		
				 while (it.hasNext()) {
					Integer n = it.next();
					System.out.println(n);
					
				}
				 
				 
				//for each
				 
				 System.out.println("for each loop");
				 
				 for (Integer x : list) {
					System.out.println(x);
				}
				 
				 
				 
				 Vector<String>  v = new Vector<String>();
				 
				 		v.add("B");
				 		v.add("A");
				 		v.add("D");
				 		v.add("C");
				 		v.addElement("E");
				 
				 
				 System.out.println("Enumeration for Legacy class Vector");
				 
				Enumeration<String>  en = 	v.elements();
		
					while (en.hasMoreElements()) {
						String s =   en.nextElement();
						
						System.out.println(s);
						
					}
				

	}

}
