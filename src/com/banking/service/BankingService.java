package com.banking.service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.banking.dto.Customer;

public class BankingService {
	private Scanner sc;

	public BankingService(Scanner sc) {
		this.sc = sc;
	}

	public void createNewCustomer() {
		System.out.println("Customer ID: " + Customer.getNextId());
//		sc.nextLine();
		System.out.print("Customer name: ");
		String name = sc.next();
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Mobile number: ");
		int mobile = sc.nextInt();
//		sc.nextLine();
		System.out.print("Passport number: ");
		String passport = sc.next();
		System.out.print("DOB (dd/MM/yyyy): ");
		String dob = sc.next();
		LocalDate date = checkValidDate(dob);
		while (date == null) {
			System.out.println("Invalid date, please try again");
			System.out.print("DOB (dd/MM/yyyy): ");
			dob = sc.next();
			date = checkValidDate(dob);
		}
	}

	private LocalDate checkValidDate(String dob) {
		LocalDate date = null;
		try {
			date = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		} catch (DateTimeException e) {
			return null;
		}
		return date;
	}

	public void assignBankAccount() {
		// TODO Auto-generated method stub
		
	}

}
