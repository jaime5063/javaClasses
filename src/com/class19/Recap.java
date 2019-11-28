package com.class19;

public class Recap {
	
	// create method to say something # numbers of times
	void sayingSomething(String Word, int Times) {
		for(int j=0; j<Times; j++) {
			System.out.println(Word);
		}
	}
	// create a method to get the sum of two numbers is
	void sum(int num1, int num2) {
		int c = num1 + num2;
		System.out.println("The sum of two numbers is equal two "+c);	
	}
	// Print a line as many times as you would like dynamically
	void sayHello(int times) {   // ---> allows you to print given number of times from your main method
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
		
	}
	// Your main method to execute code
	public static void main(String [] args) {
		Recap obj = new Recap();
		obj.sum(5, 5);	
		obj.sayHello(5);
		obj.sayingSomething("He", 3);
		
		
	}

}
