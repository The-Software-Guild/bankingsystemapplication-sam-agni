package com.banking.dto;

import java.time.LocalDate;

public abstract class BankAccount {
	private long acctNo;
	private long bsb;
	private String bankName;
	private double balance;
	private LocalDate openingDate;
	
	public BankAccount(long acctNo, long bsb, String bankName, double balance) {
		this.acctNo = acctNo;
		this.bsb = bsb;
		this.bankName = bankName;
		this.balance = balance;
		this.openingDate = LocalDate.now();
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public abstract double calculateInterest();
	
}
