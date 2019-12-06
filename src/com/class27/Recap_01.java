package com.class27;

public class Recap_01 {
	
/*Compile Time ---> achieved through method overloading
 *Run Time --> achieved through method overriding
 *
 *Method overloading, feature when inside 1 class we have multiple method with same name, but different parameters
 *	- compiler will know which method to overload based on the passed parameters
 * 	
 * Method overriding feature when super class and subclass have same method signature (parameters).
 *  - #1 Rule: inheritance must be there. 
 *  - #2 Method signature and return time must be the same.
 *  - we can use it when in the child class we want to implement our own behaviour with the same method name.
 *  
 *  Key Points
 *  
 *  Rules
 *  Method overriding:
 *   1. inheritance is a must
 *   2. method signature =  name and parameters
 *   3. return type must be the same
 *   4. Access modifiers Cannot be reduced but can be increased (public--> protected--> default--> private) <--increase/decrease-->
 *   5. static methods cannot be overridden they are hidden
 *   6. constructors cannot be overridden
 *   7. private methods cannot be overridden 
 *  
 *  'final' keyword
 *  - identifies that no further modification can be made to 3 things:
 *  	- classes
 *  	- methods 
 *  	- variables
 *  - final is a non access modifier
 *  
 *  variable syntax(example of a must for)
 *  access modifier non access modifier type name;
 *  
 *  Method Overloading vs Method Overriding
 *  1. Same method name but different parameters within(method method signature must be DIFFERENT) same class, 
 *  	while in overriding same method name and same parameters(numbers, order) everything must match.
 *  	
 *  2. Return type can be different in overloading (Return type is not part of method signature), while
 *  	in OVERRIDING must be same.
 *  3. to OVERLOAD we do not need inheritance because we are working with one class. 
 *  	to OVERRIDE we must use INHERITANCE.
 *  4. Static, final private methods can be overloaded but NOT OVERRIDING.
 *  5. Constructors can be overloaded while CANNOT BE overridden 
 *  6. In overloading no restriction to access modifiers. 
 *  	while in overriding the scope/visibility CANNOT be reduced (can be same, or increased).  
 *  
 *  --- WILL BE ASKED IN INTERVIEW ---
 *  
 */

}
