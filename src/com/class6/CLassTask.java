package com.class6;

import java.util.Scanner;

public class CLassTask {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter month you were born");		
		String month=scan.nextLine();
		
		String season;
		
		if((month.equals("jan")) || (month.equals("feb")) || (month.equals("march"))) {
			season="winter";
		}else if(month.equals("march") || month.equals("april") || month.equals("may")) {
			season="spring";
		}else if(month.equals("jun") || month.equals("jul") || month.equals("aug")) {
			season="summer";
		}else if(month.equals("sep") || month.equals("oct") || month.equals("nov")) {
			season="fall";	
		}else {
			season="Unknown";
		}
		System.out.println("you are born in "+season);
		System.out.println(month);
		
	}
}
