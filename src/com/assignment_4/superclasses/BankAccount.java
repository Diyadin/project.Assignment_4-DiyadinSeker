package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private double balance = 0;
	private String accountType = "";

	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank Account";

	}

	public String getAccountNumber() {
		return accountNumber;

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw negative value!");
		}

	}

	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);

		} else {
			System.out.println("You can not deposit a negative value!");
		}

	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType
				+ "]";
	}

}
