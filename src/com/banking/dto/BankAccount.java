package com.banking.dto;

public abstract class BankAccount {
	private long acctNo;
	private long bsb;
	private String bankName;
	private double balance;
	private String openingDate;
	
	public BankAccount(long acctNo, long bsb, String bankName, double balance, String openingDate) {
		this.acctNo = acctNo;
		this.bsb = bsb;
		this.bankName = bankName;
		this.balance = balance;
		this.openingDate = openingDate;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public abstract double calculateInterest();
	
}
