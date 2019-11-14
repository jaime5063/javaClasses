package com.class15;

public class IntQuestion1 {

	public static void main(String[] args) {

/*
 *  Write a program to swap 2num without a temp variable
 */
		int a=10;
		int b=20;
		
		a=a+b; //30
		b=a-b; //30-20 = 10
		a=a-b; //30-10 = 20
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		
System.out.println("   ");
		
		// Swap 2 string without a temp variable
		String str1="testing";
		String str2="completed";
		
		str1=str1+str2; //HelloBye
		str2=str1.substring(0, str1.length()-str2.length()); //Hello - making dynamic
		str1=str1.substring(str2.length()); //Bye - making dynamic
		System.out.println("The value of str1="+str1);
		System.out.println("The value of str2="+str2);

		
		
		
	}

}
