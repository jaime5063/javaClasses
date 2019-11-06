package com.class6;

import java.util.Scanner;

public class switchCaseString {

	public static void main(String[] args) {
		/*
		 * ask user where they are from
		 * based on the country we will specify favorite food
		 */
		
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Mexico":
			foodName="Tacos";
			break;
		case "USA":
			foodName="Burgers";
			break;
		case "Italy":
			foodName="Pizza";
			break;
		default:
			foodName="Unknown";
		}
		System.out.println("Your are from "+country+" your favorite food is "+foodName);
	}

}
