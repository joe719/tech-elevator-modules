package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
	
	private String name;
	private String address;
	private String phoneNumber;
	private List <Accountable> accounts = new ArrayList<>();
	
	
	
	public int getBalance() {
		return getBalance();
	}

	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Accountable[] getAccounts() {
		Accountable[] allAccounts = new Accountable[accounts.size()];
		accounts.toArray(allAccounts);
		return allAccounts;
	}
	
	public boolean isVip() {
		int sum = 0;
		for (Accountable moolah : accounts) {
			sum = sum + moolah.getBalance();}
			if (sum >= 25000) {
				return true;
			}
	
		
		return false;
	}
}
