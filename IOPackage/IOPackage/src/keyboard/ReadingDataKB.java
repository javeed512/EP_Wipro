package keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingDataKB {

	public static void main(String[] args) throws IOException {


		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter ur name");
		 * 
		 * String name =scanner.next();
		 * 
		 * System.out.println(name);
		 */
		
		
		
	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your salary");
				String s1 =	br.readLine();
				
			int salary =		Integer.parseInt(s1);
		
					System.out.println(salary+1000);

	}

}
