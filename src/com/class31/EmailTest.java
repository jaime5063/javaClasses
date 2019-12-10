package com.class31;

public class EmailTest {

	public static void main(String[] args) {
		// 1. Expected values
		Registration emails = new Registration();
		emails.setEmailName("testingJava@gmail.com");
		emails.setUserName("Java123");
		emails.setPassword("javaPassword");
		
		System.out.println("-- TEST #2 --");
		// 2. Test with Unsatisfied values
		Registration email = new Registration();
		email.setEmailName("testingJava"); // SHOULD BE GMAIL
		email.setUserName("");
		email.setPassword("1");
	}
}
