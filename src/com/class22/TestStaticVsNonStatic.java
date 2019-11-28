package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		/*
		 * How to access static members from another class?
		 * 	- static can be accessed by class name 
		 */
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		
		
		/*
		 * how to access non static members
		 * 	- they can be accessed by creating an obect
		 * 		of that class
		 */	
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();
		
		
	}

}
