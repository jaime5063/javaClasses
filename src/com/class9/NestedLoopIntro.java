package com.class9;

public class NestedLoopIntro {
	
	public static void main (String[] args) {
		
	// Nested Loops
		
	// our outer loop controls repetition of inner loop	
		
//		for (int j = 1; j <= 3; j++) {
//			System.out.println("I am outer loop");
//			for (int i = 1; i <= 3; i++) {
//				System.out.println("I am inner loop");
//			}
//		}
		/*
		 *  I am outer loop --> 1 iteration outer loop
			I am inner loop
			I am inner loop
			I am inner loop
			I am outer loop --> 2 iteration outer loop
			I am inner loop
			I am inner loop
			I am inner loop
			I am outer loop --> 3 iteration outer loop
			I am inner loop
			I am inner loop
			I am inner loop
		 */
//____________________________________________________________________________________________________________						

//		for (int j = 1; j >= 3; j++) {
//			System.out.println("I am outer loop");
//			for (int i = 1; i <= 3; i++) {
//				System.out.println("I am inner loop");
//			}
//		}
		/*
		 * 	Will not print because outer condition is false
		 */
//____________________________________________________________________________________________________________		

//		for (int j = 1; j <= 3; j++) {
//			
//			System.out.println("I am outer loop 2nd example");
//			
//			for (int i = 1; i >= 3; i++) {
//			
//				System.out.println("I am inner loop 2nd example");
//
//			}
//		}
		/*
		 *  Only outer condition is true. second condition is false --> will NOT print 
		 *  therefore it will be only the iteration printing, it will bounce back and print 3 times
		 */
//_______________________________________________________________________________________________________________		
		
//		for (int j = 0; j <= 5; j++) {
//
//			for (int i = 0; i <= 5; i++) {
//				System.out.println("Value of J " + j + "    Value of i " + i);
//			}
//		}

//------------------------------------------------------------------------------------------------------------------
	// making a military hour clock	
		// 24 hours, 60 minutes

//		for (int h = 0; h < 24; h++) {
//
//			for (int m = 0; m < 60; m++) {
//
//				if (m < 10) {
//					System.out.println(h + ":0" + m);
//				} else {
//					System.out.println(h + ":" + m);
//				}
//			}
//		}
//--------------------------------------------------------------------------------------------------------------------		

		// Reach number from 0000 --> 9999
		
		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				for (int a = 0; a <= 9; a++) {

					for (int b = 0; b <= 9; b++) {

						System.out.println(i + "" + j + "" + a + "" + b);
					}
				}
			}
		}
		
		
		
		
		
		
		
	}

}
