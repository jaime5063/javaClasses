package com.class22;

public class LocalVaribles {

	public static void main(String[] args) {
		
		LocalVaribles obj = new LocalVaribles();
		obj.sayName();
	}
	
	void sayName() {
		String MyName = "John"; 	// this variable is only available if we call this method
		System.out.println(MyName); // ^^^
	}

//INSTANCE VARIABLES: inside class / outside method
  	
	/* Class Human
	 * 
	 * properties: 
	 * Strings name; 
	 * String lastName;
	 * 
	 * 			assign object to variable
	 * instance variables: Human h3 = new Human();
	 * H1: copied properties: John, smith (own variables)
	 * H2: copied properties: Jimmy, Miller (own variables)
	 * H3: copied properties: Anna, Miller (own variables) Anna, Smith (changing variable) Anna, Wilson (change variable again)
	 * 		- does not affect Human Class or the other instances
	 * 		- each object gets its own copy of its variables
	 * 		- The data is separated and unique
	 */

}
