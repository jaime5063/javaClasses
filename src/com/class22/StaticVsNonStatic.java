package com.class22;

public class StaticVsNonStatic {

	// template for students(school, name, grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	// instance method / non static method
	void getInfo() {
		System.out.println("My name is "+name+" I am going to "+school+" and my grade is "+grade);
	}
	// static method
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
	}
	
	public static void main(String[] args) {
		// accessing static members within same class
		// all we need to do is use their name
		// or call method by their name only
		System.out.println(school);
		getInfo1();
	}
	
}
