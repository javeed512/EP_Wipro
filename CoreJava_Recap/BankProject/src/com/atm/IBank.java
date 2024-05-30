package com.atm;


/*
 * @Author: Javeed TL
 * Date:  30-APR-2024
 * Description: Bank interface with 2 abstract methods
 *  it is for public
 */

public interface IBank {  // specification for developers
	
	
	public static final String IFSC = "HDFC1234"; ;
	
	
	// by default all methods are public and abstract in interfaces
	
	public abstract	void deposit();
	public abstract  void  withdraw();

}
