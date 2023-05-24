package com.banking.dto;

public class FixedDepositAccount extends BankAccount {
	private double interestEarned;
	private double depositAmount;
	private int tenure;
	
	public FixedDepositAccount(long acctNo, long bsb, String bankName, double balance, String openingDate) {
		super(acctNo, bsb, bankName, balance, openingDate);
	}

	@Override
	public double calculateInterest() {
		return 0.08 * this.tenure * this.depositAmount;
	}
}
