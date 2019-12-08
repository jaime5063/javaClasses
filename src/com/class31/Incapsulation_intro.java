package com.class31;

public class Incapsulation_intro {
	
/* 4 Main OOPS concepts
 * - inheritance = process of subclass accessing all properties and behaviour of a super class
 * 		single, multilevelm hieracial, multiple (available only wit concept of Interfaces), Hybrid (combination of 2 more)
 * 
 * - Polymorphism = process when object can take many form/behaviour
 * 		static polymorphism/ Early Binding / compile time -->
 * 		achiever through method overloading
 * 		dynamic polymorphism/ early binding / Run time -->
 * 		achieve through method overriding 
 *  
 * - Abstraction = process of hiding implementation details
 * 		achieved through Abstract Classes and interfaces
 * 
 * Encapsulation = process of wrapping variables and methods in a single unit
 * 	- putting your variables and your methods together inside of a class
 *  - Any class you are writting 	
 * 		EXAMPLE: 
 * 
 * Best example of encapsulation is a class
 * To create a tightly encapsulated class we need:
 * 1. create a private data members (variables)
 * 2. create public methods to access those variables (Getters / Setters)
 * 	- Getters = get something
 * 	- Setters = setting some values
 * 
 * 	- Benefits:
 * 		- you can make your class ready only mode
 * 		- you can make you class write only mode
 * 		- A class can have total control over what is stored in its field
 * 
 * 
 *  													-- TASK -- 
 *  Group Exercise:
 *  1. must complete tasks from slide (as a group)
 *  2. each group member pick 1 question and describe the topic,
 *  	once ready record all answer as a group to flip-grid.
 *  
 *  Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter . 
 *  Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. 
 *  Test your code. 
 *  We have to calculate the percentage of marks obtained in three subjects 
 *  (each out of 100) by student A and in four subjects (each out of 100) by student B. 
 *  Create class ‘Marks’ with an abstract method ‘getPercentage’. 
 *  It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students. 
 *  The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects 
 *  as its parameters for student B. Test your code
 *  Create Registration Class in which you would have variables as email, userName and password 
 *  that have an access scope only within its own class. After creating an object of the class user should 
 *  be able to call methods and in each method separately pass values to set users email, username and password. 
 *  Requirements: 
 *  
 *  Valid email consider to be only gmail
 *  Valid userName and password cannot be empty and should be of length larger than 6 characters. 
 *  Also valid password cannot contain userName.
 *  
 *  4. Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() 
 *  which should be returning a price of the car.
 *  Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of  
 *  calculateSalePrice() method in which returned price calculated as following: 
 *  if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
 *  The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
 *  if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 * 
 * 
 * 
 */

}
