package com.class7;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// do while is similar to while
		// code will execute while condition is true
				// EVEN IF CONDITION IS FALSE CODE WILL GET EXECUTED AT LEAST ONCE
		
		int num=10;
		do{
			System.out.println("Bye");
			num++;
		}while(num<=7);
//_____________________________________________________________________________________
		
		// First way
		int num1=20;
//		do {
//			System.out.print(num1+",");
//			num1+=2;
//		}while(num1<=50);

		
		
		// 2nd way
		do {
			
			if(num1%2==0) {
				System.out.print(num1+"--> ");
			}
			
			num1++;
		}while(num1<=50);
	}
	
}
