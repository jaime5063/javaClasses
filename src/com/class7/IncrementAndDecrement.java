package com.class7;

public class IncrementAndDecrement {
	
	public static void main(String[] args) {
		
		// Increment Operators
		int a=10;
		a+=1; // assignment
		a++; // short hand assignment
		System.out.println(a);
		
		// Decrement operator
		int b=10;
		b-=1; // assignment
		b--; // short hand assignment
		System.out.println(b);
		
// only works with variables
		// Will not if you only did a++
//___________________________________________________________________________________________________________________________
		
// Loops: To repeat same block of code	
		// LOOPS: 
		//1. WHILE, 
		//2. DO WHILE, 
		//3. FOR, 
		//4. ADVANCED FOR LOOP/ENHANCE LOOP/FOR EACH.
		

// WHILE LOOP		
		int time=8;
		
		while(time<12) {
			System.out.println("Good morning");
			time++; // 8+1 , 9+1, 10+1, 11+1 (Executes print 4 times						
		}
		
// while loop syntax
		// initialize variable (should be outside of the loop)
		
		// while(test variable--> true) {
	//			code;
	//			}
		
		int ga=15;
		
		while (ga<20) {
			System.out.println("Good afternoon");
			ga++;
		}
		
		
		
		
		
		
	}

}
