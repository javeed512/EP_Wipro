package readers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamsDemo {
	
	
	public static void main(String[] args) {
		
	
	
	
	FileInputStream reader = null;
	FileOutputStream writer = null;
	
	try {
		reader = new FileInputStream("input.txt");

		writer = new FileOutputStream("output2.txt");

		int n = 0;
		while ((n = reader.read()) != -1) {

			System.out.print((char) n);

			writer.write(n);
		

		}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

	}

}
