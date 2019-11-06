package com.class3;

public class ifElseIf {

	public static void main(String[] args) {
		
		// Example 1
		int num1=100;
		int num2=99;
		
		if (num1>num2) {
			System.out.println("num1 is larger than num2");
		} else if(num1==num2) {
			System.out.println("num1 and num2 are equal");
		}else {
			System.out.println("num1 is smaller than num2");
		}
		

		// Example 2
		int day=3;
		
		if (day==1) {
			System.out.println("It is Monday");
		}else if(day==2) {
			System.out.println("Today is Tuesday");
		}else if(day==3) {
			System.out.println("Today is Wednesday");
		}else if(day==4) {
			System.out.println("Today is Thursday");
		}else if(day==5) {
			System.out.println("Today is Friday");			
		}else if(day==6) {
			System.out.println("Today is Saturday");
		}else if(day==7) {
			System.out.println("Today is Sunday");
		}else {
			System.out.println("Im not sure what day it is");
		}
		
		System.out.println("I have completed an example for if-else-if statement.");
		// If your code goes all over the place and you want to restructure Press: ctrl+shift+f  
	}

}
