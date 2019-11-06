package com.class4;

public class Recap {

	public static void main(String[] args) {


		int num = 23;
		num = 90;
		num -=200; // -110=90-200
		num -=110; //-220=-110-110
		num+=220; // 0=-220+220
		
		if (num > 0) {
			System.out.println(num + " number is positive"); 
		}else if (num ==0){
			System.out.println("Value of num is " +num);
		}else {
			System.out.println(num + " is a negative number");
		}
		
		//even or odd(7,8) = divided by 2 without any remainder
		int i=134;
		
		if(i%2==0) {
			System.out.println(i+" is an even number");
		}else {
			System.out.println(i+" is an odd number");
		}
		//Second way
		if(i%2!=0) {
			System.out.println(i+" number is odd");
		}else {
			System.out.println(i+" number is even");
		}
		
		
	}

}
