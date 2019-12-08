package com.class31;

public class Account {

/* Best 
 * 	
 */
	
	
	// 1. to achieve encapsulation we made our variables Private
	private long accountNumber;
	private double balance;
	
	// 2. created public methods to access our private variables
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	//setter
	public void setBalance(int amount) {
		balance = balance+amount;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	// able to access my variables through our methods
	

}
