package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException , ClassNotFoundException {

		FileInputStream fis = new FileInputStream("employee.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

				Object obj = ois.readObject();
				
				Employee e1 = (Employee) obj;
				
				System.out.println(e1);
				
		
		
	}

}
