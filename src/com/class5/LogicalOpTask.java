package com.class5;

import java.util.Scanner;

public class LogicalOpTask {

	public static void main(String[] args) {
	
		int day=8;
		
		if(day<=1 || day<=5) {
			System.out.println("It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		} 
		
		
		Scanner measure=new Scanner(System.in);
		System.out.println("Enter your height");
		int inches=measure.nextInt();
		
		if(inches<=48) {
			System.out.println("Short");
		}else if(inches==48 || inches<=72) {
			System.out.println("medium");
		}else if(inches>72) {
			System.out.println("tall");			
		}
		
		

	}

}
