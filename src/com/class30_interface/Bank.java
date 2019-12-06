package com.class30_interface;

public interface Bank {	
	void checkingAccount();	
	void savingAccount();

}
interface Trustable{
	void Trust();
}

class Finance implements Bank, Trustable{
	public void financing() {
		System.out.println("Financial transactions must happen");
	}
	@Override
	public void checkingAccount() {
		System.out.println();	
	}
	@Override
	public void savingAccount() {
		System.out.println();
	}
	@Override
	public void Trust() {
		System.out.println();
	}
}

class BOA implements Bank, Trustable{
	@Override
	public void checkingAccount() {
		System.out.println("BOA has a checking account");	
	}
	@Override
	public void savingAccount() {
		System.out.println("BOA has savings account");
	}
	@Override
	public void Trust() {
		System.out.println("BOA is trustable");		
	}
}

class CapitalOne implements Bank{
	@Override
	public void checkingAccount() {
		System.out.println("Capital One has a checking account");		
	}
	@Override
	public void savingAccount() {
		System.out.println("Capital One has savings account");	
	}
}
