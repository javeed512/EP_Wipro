package com.atm;

/*
 * @Author: Prakash
 * Description: Implements deposit()
 * 
 */

public abstract class BankImp1 implements IBank{

	@Override
	public void deposit() {

		System.out.println("Deposit Success");
		
	}
	
	
	public abstract void withdraw();


}
