package com.class2;

public class VariableDeclaration {

	
	public static void main(String[] args) {
		
	//1. in Java we say we are declaring the variable: example "num1"
	//The we are assigning/initializing the value of "123"	
		int num1=123;
		/*Example
		 * num1 = declaration
		 * 123 = Assigning the value
		 * 
		 */
		
		
	//2. Second way to declare a variable and assign a value
		int n1;
		int n2;
		int n3;
		
		n1=24;
		n2=1000;
		n3=83003;
		/*Example
		 * n1 = Declaration
		 * 24 = Assigning the value
		 * 
		 */
		
	//3. Third way to declare a variable and then later assign the value
	//Declare all variables together and then assign the values
		//This will only work if your declarations will be the same, in this example declared them "int"
		int number1, number2, number3;
		
		number1=3000;
		number2=23;
		number3=676;
	    //Examples of Declaration and assigning the value
		/*number1 = declaration
		 * 3000 = Assigning the value
		 */
		System.out.println(number3);
		
		//Re-assign the value of variable number3 from 676 to 1000
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		char myCharacterVariable='v';
		System.out.println("My Character Variable:" + " " + myCharacterVariable);
		
		//We re-assigned the previous value from line 38(23) to its new value from line 37 (3000).
		//Re-assigning the value
		number2=number1;
		System.out.println(number2);		 				
		
	}
}
