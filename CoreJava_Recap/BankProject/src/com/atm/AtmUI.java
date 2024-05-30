package com.atm;

import java.util.Scanner;

/*
 * @Author: Himanshu   UI-Developer
 * 
 * Description: UI for customers
 */

public class AtmUI {

	public static void main(String[] args) {

		boolean flag = true;

		Scanner scanner = new Scanner(System.in); // Has A relationship

			IBank  bank =	Util.getObject();
		
		
		while (flag) {

			System.out.println("*****WELCOME TO ATM******");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
						// deposit()
				
					bank.deposit();
				break;

			case 2:
						//withdraw()
					bank.withdraw();
				
				break;
			case 3:
					flag = false;
					
					System.out.println("Thank you , Visit again..");
				
				break;

			default:
				break;
			}

		}

	}

}
