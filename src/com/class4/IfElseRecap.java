package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		
		/*
		 * Class Schedule
		 * if Tuesday - SDLC
		 * if Wednesday - Java review
		 * if Thursday - SDLC class
		 * if Saturday - Java Class Sat
		 * if Sunday - Java Class Sat
		 */
		
		int day; //declaring variable
		day=3; // Assigning the value
		
		if (day==2) {
			System.out.println("SDLC Class");
		}else if(day==3) {
			System.out.println("Review Class");
		}else if(day==4) {
			System.out.println("SDLC Class Thur");
		}else if(day==6) {
			System.out.println("Java Class Sat.");
		}else if(day==7) {
			System.out.println("Java Class Sun");
		}else {
			System.out.println("There is no class");
		}
		
		
		
		
	}
}
