package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {
	
	public static void main(String[] args) {
		
		String str ="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		String ScannerString=scan.nextLine();
		System.out.println(ScannerString);
				
		// Access our method
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
	}
	// our method needs to be outside of the main method - we can create unlimited methods	
	// USER DEFINED METHOD:
	void myMethod() {
		System.out.println("This is user defined method that I created");
	}

}
