package com.class19;

public class EmailTask {
	
	String email(String firstName, String LastName, String emailType) {
		String email = firstName + LastName + "@"+ emailType+".com";	
		return email;
	}
	//Create method to check if a number is prime
	boolean isPrime(int num1) {
		boolean prime = false;
		
		for(int i=2; 2*i<num1; i++) {
			if(num1%i==0) {
				prime = false;
			}else {
				prime = true;
			}
		}
		return prime;	
	}	
	
	public static void main(String [] args) {
		
		EmailTask Email = new EmailTask();
		String FullEmail = Email.email("john", "doe", "gmail");
		System.out.println(FullEmail);
		
		
		boolean prime = Email.isPrime(7);
		System.out.println(prime);
		
	}

}
