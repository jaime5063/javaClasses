package com.class9;

import java.util.Scanner;

public class NestedLoopPractice {
	
	public static void main(String[] args) {
		
		
//		for (int i = 1; i <= 4; i++) {
//
//			for (int r = 1; r <= 5; r++) {
//				System.out.println("****");
//			}
//			System.out.println();
//		}

//----------------------------------------------------				
//		for(int r=0; r<5; r++) {
//			
//			for(int c=0; c<7; c++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//------------------------------------------------
		
		// print 
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 *  5 ROWS
		 *  4 COLUMS
		 */
		
//		for (int a=1; a<5; a++){  // column
//			
//			for (int b=1; b<6; b++) { // row
//				System.out.print(b);
//			}
//			System.out.println();
//		}
//------------------------------------------------------------------------------------------
		
 // Print 
 /* 123456789
	123456789
	123456789
	123456789
	123456789
  * 		
  */
//		for (int a = 1; a < 6; a++) {
//
//			for (int b = 1; b < 10; b++) {
//				System.out.print(b);
//			}
//			System.out.println();
//		}
//------------------------------------------------------------
		/*
		 *  54321
			54321
			54321
			54321
			54321
		 */
		
//		for (int a=1; a<=5; a++) {
//			
//			for(int b=5; b>=1; b--) {
//				System.out.print(b);
//			}
//			System.out.println();
//		}
//-------------------------------------------------------------------------------------------
/*
 *  5555
	4444
	3333
	2222
	1111		
 */
//		for (int i=5; i>0; i--) { // print column instead of row to do this
//			
//			for(int b=5; b>1; b--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//-------------------------------------------------------------------------------------------------------------------------
		
		// pyramid
		
		// 5 Rows
		// 5 Columns
/*		
*
**
**
***
****
*****
		 */
//		for (int i=1; i<=5; i++) {
//			
//			for(int b=1; b<=i; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//______________________________________________________________________________________________________________________
/*	
1
22
333
4444
55555
666666
7777777
88888888
999999999	
 */		
//		for(int i=1; i<=9; i++) {
//			
//			for (int n=1; n<=i; n++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//_________________________________________________________________________________________________		
/*
9
88
777
6666
55555
444444
3333333
22222222
111111111		
 */		
//		for(int i=9; i>=1; i--) {
//			
//			for(int b=9; b>=i; b--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//________________________________________________________________________________		
/*
55555
4444
333
22
1		
 */		
//		for (int i = 5; i >= 1; i--) {
//
//			for (int a = 1; a <= i; a++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//________________________________________________________________________________________________________
/*
*
**
***
****
*****
****
***
**
*		
 */		
//		for (int i=1; i<=5; i++){
//			
//			for(int a=1; a<=i; a++) {
//				System.out.print("*");
//				
//				}
//			System.out.println();
//		}
//		for(int b=4; b>=1; b--) {
//			
//			for(int c=1; c<=b; c++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//---------------------------------------------------------------------------------------------------------
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter starting point");
//		int start = scan.nextInt();
//		System.out.println("Please enter ending number");
//		int end = scan.nextInt();
//		
//		int sumEven = 0;
//		int sumOdd = 0;
//
//		for (int i = start; i <= end; i++) {
//			if (i % 2 == 0) {
//				sumEven = sumEven + i;
//			} else {
//				sumOdd = sumOdd + i;
//			}
//		}
//		System.out.println("The sum of even numbers " + sumEven);
//		System.out.println("The sum of odd numbers " + sumOdd);
	
	
//-----------------------------------------------------------------------------------------------------------------------
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter number between 1 and 20");
//		
//		for (int i = 0; i < 100; i++) {
//			int num = scan.nextInt();
//			int guess = 13;
//			if (num == guess) {
//				System.out.println("Congratulations!! you got it!.");
//				break;
//			}
//			if (num >= guess) {
//				System.out.print("You number is too large. ");
//			} else {
//				System.out.print("Your number is too small. ");
//			}
//			System.out.println("The guessing number is between 1-20");
//		}
//	}
		
// TEACHER VERSION
		// DO WHILE LOOP (since we do not know how many times the user will attempt the secret number.
		
//		Scanner scan;
//		int secretNumber, guessNumber;
//		scan = new Scanner(System.in);
//		secretNumber = 12;
//		
//		do {
//			System.out.println("Please guess my number from 1 to 20");
//			guessNumber = scan.nextInt();
//			if (guessNumber < secretNumber) {
//				System.out.println("Your number is too small");
//			} else if (guessNumber > secretNumber) {
//				System.out.println("Your number is too large");
//			}
//		} while (guessNumber != secretNumber);
//		System.out.println("Congratulations you got it");

		// - DOING WITH WHILE LOOP - 
		
		Scanner scan;

		int secretNum, guessNum;
		scan = new Scanner(System.in);
		secretNum = 11;

		do {
			System.out.println("Guess number from 1 - 20");
			guessNum = scan.nextInt();

			if (guessNum == secretNum) {
				System.out.println("You guessed the correct number");
				break;
			} else if (guessNum > secretNum) {
				System.out.println("number is too large");
			} else {
				System.out.println("Number is too small");
			}

		} while (guessNum != secretNum);
		
		
		
		
		
	}	
	
}


