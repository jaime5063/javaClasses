package com.class31;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setAccountNumber(12345689);
		long accountNum = acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(200);
		double myBalance = acc.getBalance();
		System.out.println(myBalance);
	}
}
