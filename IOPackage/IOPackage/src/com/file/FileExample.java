package com.file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {

		

		try {
			File f = new File("cricket.txt");
			f.createNewFile();

			System.out.println(f);

			System.out.println("Is File available " + f.exists());
			
			File  dir =  new File("worldcup");
			
				dir.mkdir();  // creating folder
			
			System.out.println("Folder exist "+dir.exists());
			
			File  f2 = new File("worldcup","javeed");
					f2.mkdir();
					
					System.out.println(f2);
				
					System.out.println("Is File "+f.isFile());
					
					System.out.println("Is Dir "+f2.isDirectory());
					
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
