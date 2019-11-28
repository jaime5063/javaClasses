package com.Class26;

public class BankTest {

	public static void main(String[] args) {
		
		Bank fee = new Bank();
		fee.money=900;
		double bankFee = fee.chargeFee();
		System.out.println(bankFee);
		
		PNC pnc = new PNC();
		pnc.money=700;
		double pncFee = pnc.chargeFee();
		System.out.println(pncFee);
	}

}
