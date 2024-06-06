package buffers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		FileReader fr=new FileReader("cricket.txt"); 
		BufferedReader br=new BufferedReader(fr); 
		String line=br.readLine(); 
		while(line!=null) 
		{ 
		System.out.println(line); 
		line=br.readLine(); 
		} 
		br.close(); 
		} 
}


