package com.class25;

public class Addition {
	
	//Polymorphism
	// - one method (add) being able to perform two different actions based on the object
	// - Example, here we can use it to add 2 numbers or 3 numbers	
		/*Method overloading - having same method name within the same class
		 * 1. by passing different AMOUNT of parameters
		 * 2. by passing different TYPE of parameters
		 */	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}

	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	public double add(int num1, double num2) {
		double sum = num1+num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		// Same method with different actions (add method we created)
		Addition obj = new Addition();
		obj.add(11, 13);
		obj.add(12, 13,14);
		obj.add(12.09, 12.10); 
		
		// Same method with different actions (substring)
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));
	}
}

