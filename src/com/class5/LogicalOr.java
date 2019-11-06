package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
				// ||
				// if (true OR true) --> true
				// if (true OR false) --> true
				// if (false OR true) --> true
				// if (false OR false) --> false
		
		// 7 days a week
		// if days is 2 or 4 --> SDLC class
		// if day is 6 or 7 --> Java class
		// if day is 1 or 5 --> No class
		// if day =3 --> Review class		
		int day=8;
		
		if(day == 2 || day ==4) {
			System.out.println("SDLC class");
			
		}else if(day == 6 || day == 7) {
			System.out.println("Java class");
			
		}else if (day == 1 || day == 5) {
			System.out.println("No class");
			
		}else if(day == 3) {
			System.out.println("Review class");
			
		}else {
			System.out.println("Not a valid day");
		}
		
		
		// USING STRINGS 
		// 7 days a week
		// if days is Tuesday or Thursday --> SDLC class
		// if day is Saturday or Sunday --> Java class
		// if day is Monday or Friday --> No class
		// if day =Wednesday --> Review class		
		String weekDay="Sunday";
		
		if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")){
			System.out.println("SDLC class");
		}else if (weekDay.equals("Satuday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");			
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Invalid day entry");
		}
		
		
		
		
		
		
		
		
		
	}
}
