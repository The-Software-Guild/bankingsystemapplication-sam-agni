package com.banking.dto;

public class Customer {
	private int id;
	private String name;
	private int age;
	private int mobile;
	private String passport;
	private static int nextId = 100;
	private BankAccount bankAcct;
	private String dob;
	
	public Customer(String name, int age, int mobile, String passport, String dob) {
		this.id = nextId++;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.passport = passport;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", passport="
				+ passport + ", dob=" + dob + "]";
	}

	public static int getNextId() {
		return nextId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setBankAcct(BankAccount acct) {
		this.bankAcct = acct;
	}
	
}
