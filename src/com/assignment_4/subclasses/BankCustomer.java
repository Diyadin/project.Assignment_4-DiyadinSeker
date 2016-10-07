package com.assignment_4.subclasses;

import java.util.*;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human {

	public BankCustomer(String name, int age) {
		super(name, age);

	}

	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	public void addAccount(BankAccount bankAccount) {

		customerAccounts.add(bankAccount);

	}

	public void depositToAccount(String accountNumber, double amount) {

		for (int x = 0; x < customerAccounts.size(); x++) {

			if (customerAccounts.get(x).getAccountNumber().equals(accountNumber)) {

				customerAccounts.get(x).depositMoney(amount);
			}

		}

	}

	public void withdrawFromAccount(String accountNumber, double amount) {

		for (int x = 0; x < customerAccounts.size(); x++) {

			if (customerAccounts.get(x).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(x).withdrawMoney(amount);

			}

		}

	}

	public String toString() {
		System.out.println("Customer: " + this.getName() + " age: " + this.getAge());
		String build = "";

		for (int x = 0; x < customerAccounts.size(); x++) {

			build += customerAccounts.get(x).toString();
		}

		return build;

	}

}
