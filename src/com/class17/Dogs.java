package com.class17;

public class Dogs {
	
	String name, breed, color;
	int weight, age;
	

	// here you need to change come of these into ACTIONS
	void running(){
		System.out.println("My dog "+name+" "+"likes to run");
	}
	
	void age() {
		System.out.println(name+" is "+age+" years old");
	}
	
	void breed() {
		System.out.println("my dog "+name+" is of "+breed+" breed");
	}
	
	void color() {
		System.out.println("My dog "+name+" is "+color+" color");
	}
	
	void weight() {
		System.out.println("My dogs weight is "+weight);
	}
	
}
