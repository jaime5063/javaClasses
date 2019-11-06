package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {
	
	public static void main(String[] args) {
		
		Scanner age=new Scanner(System.in);
		System.out.println("Enter your age");
		int old=age.nextInt();
		
		// using the && operator so that it requires BOTH conditions to be true (the age range)
		if(old<=1 && old<3) {
			System.out.println("you are a baby");
		}else if(old==3 && old<5) {
			System.out.println("you are a toddler");
		}else if(old==5 && old<12) {
			System.out.println("you are a kid");
		}else if(old==12 && old<19) {
			System.out.println("You are a teenager");
		}else if(old>=20) {
			System.out.println("you are an adult");
		}
		
		
	}

}
