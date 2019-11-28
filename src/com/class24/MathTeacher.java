package com.class24;

public class MathTeacher{
	
	String name;
	String subject;
	public static boolean teacher = true;
	
	
	MathTeacher(String name, String subject, String schoolName) {
		this.name = name;
		this.subject = subject;

	}
	
	public void dispMath() {
		System.out.println("My name is "+name+", "+teacher+" I teach "+subject);
	}
	
}
