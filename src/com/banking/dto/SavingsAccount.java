package com.banking.dto;

public class SavingsAccount extends BankAccount {
	private double interestEarned;
	private boolean isSalaryAccount;
	private double minBalance = 100;

	public SavingsAccount(long acctNo, long bsb, String bankName, double balance, String openingDate, boolean isSalaryAccount) {
		super(acctNo, bsb, bankName, balance, openingDate);
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public double calculateInterest() {
		return 0.04 * this.getBalance();
	}

}
