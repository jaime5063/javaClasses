package com.class15;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {

		//lets ask used to enter browser
		//based on the input we will print where execution will take place
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser=scan.nextLine();
		
		switch(browser.toLowerCase()) { // case must match your condition .toLowerCase
		case "firefox":
			System.out.println("Execution will be performed on "+browser);
			break;
		case "chrome":
			System.out.println("Execution will be performed on "+browser);
			break;
		case "safari":
			System.out.println("Execution will be performed on "+browser);
			break;
		case "internet explorer":
			System.out.println("Execution will be performed on "+browser);
			break;	
		default:
			System.out.println("Please enter valid browser");
		}
		
		
		
		
		
		
	}

}
