package com.class23;

public class ConstructorDemo {
	
// default constructor which compiler creates for you, but you will not see it 
	//	ConstructorDemo(){
	//	}
	
	// Creating our own constructor for the class "ConstructorDemo" - (non argument constructor)
	ConstructorDemo(){
		System.out.println("I am your constructor");
	}
	// Creating a parameterized constructor (has one parameter)
	ConstructorDemo(String str){
		System.out.println("I am constructor with 1 parameter "+str);
	}

	public static void main(String[] args) {
		
		// creating the object which will call your constructor
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("code after creating an Object");
		obj.hello();
		
		ConstructorDemo obj1 = new ConstructorDemo("My Parameter");

	}
	
	public void hello() {
		System.out.println("Hello class");
		System.out.println("Hello instructors");
	}


}
