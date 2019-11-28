package com.class20;

public class AccessModifierIntro {
	
	//VARIABLES: Variable Access Modifiers
	
		//Public - can seen/access from anywhere
		public String name;
		
		//default - can seen/access within the package
		String name1;
		
		//Private - can be seen/accessed within the class
		private int add;
		
		//Protected - can be seen/accessed only within package
		protected int adding;
		
		
	// METHOD: Access Modifiers
	
		//Public - can seen/access from anywhere
		public void add() {}
		
		//Default - can seen/access within the package
		void add1() {}
		
		//Private - can be seen/accessed within the class
		private void adding() {}
		
		//Protected - can be seen/accessed only within package
		protected void adding1() {}
	
		
	// HOW TO IMPORT ALL CLASSES
		// import com.class20.*;		   ---> Basically importing all classes within that package
	
	// HOW TO IMPORT ONE BY ONE
		//EXAMPLE:
		// import com.class20.MySonMath    ---> Basically choosing the class within that package
	
	
		// TASK
			//Create a method that will take 1 parameter as a String and return reversed String. 
			//Method should be visibly only within same package.
	
	
	
	
	
}
