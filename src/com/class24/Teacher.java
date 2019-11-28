package com.class24;

public class Teacher {
	
	String name;
	String subject;
	public static boolean teacher = true;
	
	
	Teacher(String name, String subject, String schoolName) {
		this.name = name;
		this.subject = subject;

	}
	
	public void teach1() {
		System.out.println("My name is "+name+", "+teacher+" I teach "+subject);
	}	
	
	

}
