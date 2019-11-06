package com.class7;

import java.util.Scanner;

public class WhileDoHomework {
	
	public static void main(String[] args) {
	
	/*
	 * need to ask user to "Please pay for coffee"
	 * keep asking user to pay for it until 
	 * entered price is = 5;
	 * After user paid then say "Enjoy your coffee"
	 * 
	 * Hint:
	 * use Scanner
	 * While Loop
	 */
	
	Scanner pay=new Scanner(System.in);
	// FIRST WAY
//	int coffee=1;
//	
//	do{
//		System.out.println("Please pay for coffee");
//		coffee=pay.nextInt();
//		coffee++;
//	}
//	while(coffee<=5); {
//		System.out.println("Enjoy your coffee");
//		
//	}
	
	// SECOND DAY
	int price;
	do {
		System.out.println("Please par for your coffee");
		price=pay.nextInt();
	}while(price!=5); // the program will keep repeating as long as this condition is true
	System.out.println("Enjoy your coffee");
//_______________________________________________________________________________________________________________________________
	
	
	
	
	
	}
}
