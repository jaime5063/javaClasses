package com.class8;

import java.util.Scanner;

public class WhileExample {
	
	public static void main(String[] args){
		
		
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();
		
		}while(isRain); // if condition is true it will keep looping inside DO Body.
		System.out.println("Go to the park"); // once its false it THEN prints out this line from WHILE
		
		
	}

}
