package com.class8;

public class ForLoopIntro {
	
	public static void main(String[] args) {
		
		/*
		 * When we know in advance how many times we want to repeat
		 * block of code, BEST choice is FOR Loop
		 * MOST COMMON(Popular) LOOP we will be using
		 */		
		
		// Initialization
		// Test the condition
		// increment / decrement
		for( int i = 1; i<=5; i++) {
			System.out.println("Hello World"); // Print 5 times
		}
		
		// Print INCREMENT numbers 1-10		
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
		
		// Print DECREMENT numbers 10-1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		// Print 1-50 INCREMENT by 5
		for(int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
		
		//NOTE the reason why we can use the same variable i multiple time is because it lives inside the body
		// of the loops. Declaration happened inside body of loops
		
	}

}
