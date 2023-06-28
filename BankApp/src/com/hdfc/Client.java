package com.hdfc;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		boolean flag = true;

	IBank bank =	new Bank2();
		
		do {

			System.out.println("***Welcome to ATM****");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			//System.out.println("3. Check Balance");
			System.out.println("0. Exit/Logout");

			Scanner scanner = new Scanner(System.in);

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

					bank.deposit();
				break;

			case 2:

					bank.withdraw();
				break;

			
			case 0:

				flag = false;
				
				System.out.println("Thank you visit again..");
				
				break;

			default:
				
				System.err.println("Sorry ! Invalid option");
				
				break;
			}

		} while (flag);
		
		
		
		
	}

}
