package com.class21;

public class School {
	public static void main(String[] args) {
		/* do not need too IMPORT student class because it lives in the same package
		 */
		// Create an object / instance
		Student student1 = new Student();
		// assigning instance variables
		student1.studentName="Eric";	// --> studentName= instance variable / "Eric". 
		student1.GPA= 3.95;
		student1.school="Syntax";
		
		// another object / instance
		Student student2 = new Student();
		// giving values
		student2.studentName = "Jaime";
		student2.GPA = 3.90;
		student2.school = "Syntax Technologies";
		
		
		// instance method
		student1.displayInfo();
		student1.study(3);
		
		// instance method
		student2.displayInfo();
		
		System.out.println("student1 again");
		student1.displayInfo();
		
		// local variables - within a method or within a block of code
		// 
		
		
	}

}
