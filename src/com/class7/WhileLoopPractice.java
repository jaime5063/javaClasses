package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		// I want to print numbers from 1-20
		int i=1;
		
		while(i<=20) {
			System.out.println(i);
			i++;
		}

		// I want to print 10-30 in a single line
		int y=10;
		
		while(y<=30) {
			System.out.print(y+", ");
			y++;
		}
		// print 10-1
		System.out.println(" ");
		int M=10;
		
		while(M>=1) {
			System.out.print(M+", ");
			M--;
		}
		// print 50-20
		System.out.println(" ");
		int x=50;
		
		while(x>=20) {
			System.out.print(x+", ");
			x--;
		}
		// print even numbers only 2-20 (FIRST WAY)
		System.out.println(" ");
		int even=2;
		
		while(even<=20) {
			System.out.print(even+", ");
			even+=2;
		}
		// print even numbers only 2-20 (SECOND WAY) - using modulus
		System.out.println(" ");
		int evenNum=1;
		
		while(evenNum<=30) {
			
			if(evenNum%2==0) {
			System.out.print(evenNum+", ");
			
			}
			evenNum++; // Keep inside WHILE LOOP body but outside of IF CONDITION body.
		}
		
		
		
		
	}
}
