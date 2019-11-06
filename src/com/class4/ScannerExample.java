package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	
		// Scanner is class in Java that will allow us to take an
		// input from a user
		// Scanner will help us make our program more interactive
		
		// "System.in" = I want to take input from the keyboard
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any nymber: ");
		/*nextInt(); --> Numbers
		 * nextLine(); --> Strings
		 * nextDouble(); --> double
		 * 
		 */
		int number=scan.nextInt(); // We initiated number input with nextInt
		System.out.println("Entered number is: "+number); 
		
		System.out.println("___________________________________________");
				
		Scanner input=new Scanner(System.in); // initiated scanner input with System.in			 
		System.out.println("Please enter name: "); // String title for input
		String name=input.nextLine();  // initiated input for a String in the Scanner
		System.out.println("Good afternoon "+name);  // Print string with input

		System.out.println("___________________________________________");
		
		Scanner decimalNum=new Scanner(System.in); // initiated scanner input with System.in
		System.out.println("Enter GPA"); // String title for input
		double decimal=input.nextDouble(); // initiated input for Double in the Scanner
		System.out.println("Your GPA is: "+decimal); //print string with input
		
		
	}
}
