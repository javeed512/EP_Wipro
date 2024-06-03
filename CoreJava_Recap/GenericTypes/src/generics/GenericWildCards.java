package generics;

import java.util.ArrayList;

public class GenericWildCards {

	public static void m2(ArrayList<? extends Number> al) {

		System.out.println(al);

	}

	public static void m3(ArrayList<? super  Number> al) {

		System.out.println(al);

	}

	public static void main(String[] args) {

		ArrayList<Byte> al1 = new ArrayList<Byte>();
		ArrayList<Long> al2 = new ArrayList<Long>();
		ArrayList<String> al3 = new ArrayList<String>();

		m2(al1);
		m2(al2);
		// m2(al3);
		
		
		ArrayList<Number> al4 = new ArrayList<Number>();
		ArrayList<Object> al5 = new ArrayList<Object>();
		
		m3(al5);

	}

}
