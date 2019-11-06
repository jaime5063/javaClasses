package com.class5;

import java.util.Scanner;

public class HomeWorkRvw {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card? True or False");
		boolean cc=input.nextBoolean();
		
		if (cc) {
			System.out.println("What is your balance?");
			int balance=input.nextInt();
			
			if(balance>=1000) {
				System.out.println("Please pay off your balance");
			}else {
				System.out.println("You can spend more money");
			}
			
		}else {
			System.out.println("Would you like to apply for credit card?");
		}
		
	}
}
