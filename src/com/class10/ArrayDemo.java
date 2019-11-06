package com.class10;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int [] nums=new int[4]; // INITIATION
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		System.out.println(nums.length);
 // Find number of elements inside your array use property of an array (.length), based on your INITIATION = 4.
		
		
	// Another way to create an array
		
		String[] array= {"Winter", "Fall", "Summer","Spring"};		
		//				 elmnt 1    elmnt2   elmnt3   elmnt4
		
		System.out.println("I was born in "+array[2]); 
		System.out.println(array.length); // how many elements (1st way)
		
		int arraySize=array.length; // how many elements (2nd way)
		System.out.println(arraySize);
		
		
		
		
		
		
		
	}

}
