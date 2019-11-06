package com.class6;

public class SwitchStatement1 {

	public static void main(String[] args) {
		
		// works only with: byte, short, integer, char, String		
		// You are simply checking if the VALUE equals to your VALUE
		
		//switch case is similar to if else
		//switch case improves readability and it is faster
		//switch case is a value base, if else if a condition base
		/*
		 * Limitations:
		 * Switch only works with byte, short, int, char, String
		 * no relational or logical operator can be used
		 * data type of variable and case MUST be same
		 * duplicate is optional and it is similar as else block
		 * we need BREAK
		 */
		
		int day =3;
		String weekDay;
		
		switch (day) {
		case 1:
			weekDay="Monday";
			break;
		case 2:
			weekDay="Tuesday";
			break;
		case 3:
			weekDay="Wednesday";
			break;
		case 4:
			weekDay="Thursday";
			break;
		case 5:
			weekDay="Friday";
			break;
		case 6:
			weekDay="Saturday";
			break;
		case 7:
			weekDay="Sunday";
			break;
		default:
			weekDay="Invalid";
			
		}
		System.out.println(weekDay);
	}
	

}
