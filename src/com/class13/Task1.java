package com.class13;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter you class day: ");
		String day=scanner.nextLine();
		
		if(day.trim().equalsIgnoreCase("Saturday")) { //.trim //.equalsIgnoreCase
			System.out.println("Saturday is your Java class");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your GIT class");
		}else if(day.equalsIgnoreCase("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.equalsIgnoreCase("Thursday")) {
			System.out.println("Thursday is your manual class");
		}else {
			System.out.println("Invalid entry!! Please enter a valid day");
		}	
		scanner.close();
	
	}

}
