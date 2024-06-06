package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		
		  Employee emp = new Employee(101,"javeed");
		  
		  FileOutputStream fos = new FileOutputStream("employee.ser");
		  
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  
		  
		  
		  oos.writeObject(emp);
		  
		  System.out.println("Employee obj Serialized");
		 

	}

}
