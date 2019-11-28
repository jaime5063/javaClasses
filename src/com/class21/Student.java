package com.class21;

public class Student {
	
	// Local variable: 
		// variables only live inside the method. 
		// Once the method is over they die.
		// They basically come back to life when you use the method again and then after, dies again
	
	// Global variables here
	public String studentName;   //--> instance variable
	public double GPA;			 //--> instance variable	
	public static String school; //--> static variable/class variable. Cannot be local. Belongs to the class.
	
	
	public void displayInfo() {
		System.out.println(studentName +" is attending the school "+school+ " has a gpa "+GPA);
	}
						// hours = local variable
	protected void study(int hours) {
		int localVariable = 4;
		System.out.println(studentName+" is studying for " + hours +" hours.");
	}

/**A variable which is declared as static is called static variable. 
 * Static variables is also declared inside the class but outside the method, constructors or any block.
*Static variable is a variable which belongs to the class and initialized only once at the start of the execution.
*Static variable can be used to refer to the common property of all objects that is not unique for each other.
*/
	
	

}
