package com.Class26;

public class FullTime extends Employee{
	
	// child class, we are introducing our own feature(s)--> override
	int bonus;
	
	public void getPaid() { // --> overriding method from parent class
		System.out.println("Full time Employee gets paid "+salary+" and bonus "+bonus);
	} 
}
