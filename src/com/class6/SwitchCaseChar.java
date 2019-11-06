package com.class6;

import java.util.Scanner;

public class SwitchCaseChar {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter gender: F or M");
		char gender=scan.next().charAt(0);
		
		String yourGender;
		
		switch(gender) {
		case 'F':
			yourGender="Female";
			break;
		
		}
		
		
	}

}
