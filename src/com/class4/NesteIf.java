package com.class4;

public class NesteIf {

	public static void main(String[] args) {
		
		// Nested if statement
		//If your outter "if" is false, the compiler will not care for your inner "if"
		
		// Change True false values to test the code
		boolean b = true; 
		boolean classToday = true;
		
		if (b) {
			System.out.println("Hello");
			if(classToday) {
				System.out.println("Hello my friends");
			}
		}else {
			System.out.println("Bye");
		}

	}

}
