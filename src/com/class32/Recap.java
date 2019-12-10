package com.class32;

public class Recap {
	public static void main(String[] args) {
	
	// to store single value
	int num = 10; 
	
	// to store multiple values
	int[] array = {10, 20, 30};
	
	int[] arr = new int[3];
	arr[0] = 100;
	arr[1] = 200;
	arr[2] = 300;
	System.out.println(arr[2]);
	
	// to retrieve all values one by one 
	// using enhanced loop
	for(int nuM:arr) {
		System.out.println(nuM);
	}
	// to retrieve all values one by one 
	// using for loop
	for(int i =0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	// We can store non primitive types: Objects
	Fruit f = new Apple();
	Fruit f1 = new Banana();
	Fruit f2 = new Orange();
	Object monkey = new Monkey();
	// instead of referring to the immediate parent class, we refer to the object to create the relationship
	// allows us to store different types of values
	Object[] mixArray = {f, f1, f2, monkey, "Hello"};
	for(Object fr:mixArray) {
		
	}
	}
}		  // this happens implicitly on the back end (every parent is an object class)	
class Monkey extends Object{
	
}

class Fruit{
	
}

class Apple extends Fruit{
	
}

class Orange extends Fruit{
	
}

class Banana extends Fruit{
	
}

/* Array:
 * - stores multiple values of same type
 * 
 * Data types:
 * primitive: 8
 * non primitive: unlimited (String, Scanned, othersYourCreate example: Monkey) 
 * 
 * When we create an array we can store primitive and non primitive
 * Primitive: 
 * byte[]
 * short[]
 * int[]
 * long[]
 * float[]
 * boolean[]
 * char[]
 * double[]
 * 
 * Non-Primitive:
 * String[]
 * Object[]
 * Monkey[]
 * Fruit[]
 * 
 * Limitation of array
 * Array is a fixed size data structure
 * We do not have methods to manipulate with data such as( add, remove, replace etc).
 * 
 * 
 * 				TO OVERCOME LIMITATION WITH THE ARRAY ---> 'COLLECTIONS' concepts came.
 * 
 * COLLECTION: is a group of objects represented as a single unit.
 * 
 * 	Wrapper classes: is a class that converts non primitive types into an Object types.
 *  why do we need?
 *  - we can store converted primitive types inside our collections (numbers, characters, boolean)
 *  
 * 	Boxing: 8 primitive types. 8 Wrapper classes.
 * 	int     --> Integer
 *  boolean --> Boolean
 *  byte    --> Byte
 *  char    --> Character
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








