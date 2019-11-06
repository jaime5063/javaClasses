package com.class8;

import java.util.Scanner;

public class LoopBreakContinue {
	
	public static void main(String[] args) {
		
		// KEYWORDS
		
		//1st --> BREAK
			// Breaks (Stops) the loop
		
		for (int i=0; i<10; i++) {
			
			if(i==2) {
				break; // stop as soon as your iteration is = 2
			}
			System.out.println(i);			
		}
		System.out.println("I am out of the loop");
//_____________________________________________________________________________________________________________________________
		
	//2nd --> CONTINUE
		// Will skip CURRENT iteration
		for (int i = 0; i <= 20; i++) {

			if (i == 5 || i == 6 || i == 7) { // remove these number from printing
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("");		
		System.out.println("I am out of the loop");
	// EXAMPLE 2
		for (int a=0; a<=20; a++) {
			if (a>=5 && a<=7) {
				continue;
			}
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
//_______________________________________________________________________________________________________________________________
/*
 * 	Print numbers from 1-50 except those that are divisible by 3	
 */
	for(int i=0; i<=50; i++) {
		if(i%3==0) {
			continue;
		}
		System.out.print(i+" ");
	}	
	
	System.out.println();
	// Create a program that will be asking user to apply for credit card 10 times
	// As soon as you get an "yes" from a user program should stop asking
	
	Scanner scan=new Scanner(System.in);

	for(int i=0; i<=10; i++) {
		System.out.println("would you like to apply for a cc");
		String cc=scan.next();
		if(cc.equals("Yes")) { // you can use equalsIgnoreCase, to ignore case sensitivity
		break;
		}
	}
	System.out.println("Thank you, Good Bye!");
/*
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 *	Nest class NESTED LOOPS
 *
 *	
 */
		
		
		
	}

}
