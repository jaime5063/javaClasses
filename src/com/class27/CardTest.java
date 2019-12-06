package com.class27;

public class CardTest {

	public static void main(String[] args) {
		
//take an object of the child class and give reference to the parent
		// process of type=casting (objects)
		// casting the objects =  changing from child to parent to grandparent class
	//reference var=object is created
		Card card = new AX();
		card.creditLimit(); // credit limit of overridden child class
		
		Card card1 = new MC();
		card1.creditLimit();// also coming from child class overridden
		
		Card card2 = new Visa();
		card2.creditLimit();// also coming from child class overridden
		
		// creating an array
		// type[] arrayName={};
		// type[] arrayName=new type[];
		int [] numArray = {10, 12, 13};
		String [] stringArray = {"aa", "bb"};
		
		// create an array that can hold all the car types
		Card[] cardArray= {card, card1, card2}; // bringing the variable that hold Card type from our objects
		
		// instead of assigning the object to a variable you can assign directly into the array
		Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
		
		// access each card 1 by 1 = create a loop
		//cardArray[0] --> MC
		//cardArray[3] --> Discovery
		System.out.println("-------------------");
		for(Card myCard :cardArray1) {
			myCard.creditLimit();			
			//--OR--
			for(int y=0; y<cardArray1.length; y++) {
				cardArray1[y].creditLimit();
			}
			
			
		}
	}
}
// data types:
// Primitive and Non-Primitive (Study)