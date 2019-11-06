package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		boolean isFriday=true;
		int day=13;
		
		//if today is Friday only day i want to check if it is 13
		
		if (isFriday) {
			System.out.println("Today is Friday");
			if(day==13) {
				System.out.println("I will watch a scary movie");
			}
		}else {
			System.out.println("Today is Not friday");
		}
		
		
		
		
		
		boolean sunday=true;
		boolean time=true;
		
		if(sunday) {
			System.out.print("Today is Sunday ");
			if(time) {
			    System.out.println(" I will go to SixFlags @ 12noon.");
			}
		}else {
			System.out.println("Today is Not Sunday");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
