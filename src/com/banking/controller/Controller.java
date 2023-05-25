package com.banking.controller;

import java.util.Scanner;

import com.banking.service.BankingService;

public class Controller {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\n");
		BankingService service = new BankingService(sc);
		String menu = "1. Create New Customer Data\n" + 
				"2. Assign a Bank Account to a Customer\n" + 
				"3. Display balance or interest earned of a Customer\n" + 
				"4. Sort Customer Data\n" + 
				"5. Persist Customer Data\n" + 
				"6. Show All Customers\n" + 
				"7. Search Customers by Name\n" + 
				"8. Exit";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			switch (option) {
			case 1: {
				service.createNewCustomer();
			}
			case 2: {
				service.assignBankAccount();
			}
			case 6: {
				
			}
			}
		} while (option != 8);
		
	}
	
}
