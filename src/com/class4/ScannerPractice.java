package com.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		// ask user to enter 2 numbers and then compare
		
		Scanner keyboard=new Scanner(System.in); // we initiated the Scanner
		
		System.out.println("Please enter first number: "); // initiated first string title
		int num1 = keyboard.nextInt(); // initiated integer input
		System.out.println("Please enter second number"); // initiated second string title 
		int num2 = keyboard.nextInt(); //initiated second integer input
		
		if (num1>num2) {  // if num1 is greater that num2 (comparing)
			System.out.println(num1+" is larger than "+num2);  // print this if num1 is larger number
		}else { // if not
			System.out.println(num1+" is smaller than "+num2); // print this is num2 is the larger number
		}
		

	}

}
