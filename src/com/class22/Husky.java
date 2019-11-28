package com.class22;

public class Husky {
	
	// static variables 
	static String breed = "Husky";
	static int paws=4;
	static int tail=1;
	
	// instance variable
	String name;
	String color;
	
	// method
	void display() {
		System.out.println("Dog name is "+name+" and its breed is "+breed);
	}

	public static void main(String[] args) {
		
		Husky puppy = new Husky();
		puppy.name="Meatball";
		puppy.color="Brown";
		puppy.display();
		
		Husky puppy2 = new Husky();
		puppy2.name="Sharik";
		puppy2.color="black";
		puppy2.display();
		
		Husky puppy3 = new Husky();
		puppy3.name="Jack";
		puppy3.color="Gray";
		puppy3.breed="Bulldog"; // changing the static breed
		
		// with new breed
		puppy3.display();
		puppy2.display();
		puppy.display();
		
		
	}

}
