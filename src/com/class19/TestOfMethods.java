package com.class19;

public class TestOfMethods {

	public static void main(String[] args) {
		
		// By calling the methods...
		// find the largest number of 300 and 500
		// -- then identify if largest number is odd		
	AllMethods obj = new AllMethods();		
		int largest = obj.largerNumber(2, 3);
		boolean odd = obj.isOdd(largest);
		System.out.println("Is "+largest+" an even number? "+odd);			
	}
	
	/** method will take a week day number and return
	 * 	a week day name
	 */
	String weekDayName(int weekDay) {
		String weekDayName;		
		switch(weekDay) {
		case 1:
			weekDayName = "Monday";
			break;
		case 2:
			weekDayName = "Tuesday";
			break;
		case 3:
			weekDayName = "Wednesday";
			break;
		case 4:
			weekDayName = "Thursday";
			break;
		case 5:
			weekDayName = "Friday";
			break;
		case 6:
			weekDayName = "Saturday";
			break;
		case 7:
			weekDayName = "Sunday";
			break;
			default:
				weekDayName = "Unknown";
	}
		return weekDayName;
	}
}
	
	


