package com.class3;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		int num3=1000;
		
		num3+=1000;
		System.out.println(num3);
		// Prints 2000
		
		int num4=50;
		num4+=20;
		System.out.println(num4);
		// Prints 70
		
		num4-=30;
		System.out.println(num4);
		//Prints 40 because on line 13 you added 20 more
		//therefore it is now subtracting 30 from 70
		
		num4/=10;
		System.out.println(num4);
		//Prints 4
		
		num4%=2; num4=4%2;
		System.out.println(num4);
		//prints 0 
		
	}
}
