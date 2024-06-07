package com.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {


		Properties  prop = new Properties();	
		
		FileReader  fr  = new FileReader("application.properties");
		
			prop.load(fr);
			
		String username  =	prop.getProperty("username");
		String password  =	prop.getProperty("password");
		String city  =	prop.getProperty("city");
		
		
		System.out.println(username +" "+password +" "+city);

	}

}
