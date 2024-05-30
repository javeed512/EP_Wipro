package com.atm;

/*
 * @Author: Javeed TL

 * Description: Util class to access services by outsider
 */

public class Util {
	
	
	public static  IBank   getObject(){
		
			return  new BankImp2();
		
	}
	

}

		
