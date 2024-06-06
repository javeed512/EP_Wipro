package buffers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) throws IOException {


		FileWriter fw=new FileWriter("cricket.txt"); 
		BufferedWriter bw=new BufferedWriter(fw); 
		System.out.println(bw);
		
		bw.write(65); 
		bw.newLine(); 
		char[] ch={'a','b','c','d'}; 
		bw.write(ch); 
		bw.newLine(); 
		bw.write("bhaskar"); 
		bw.newLine(); 
		bw.write("software solutions"); 
		bw.flush(); 
		bw.close(); 
		

	}

}
