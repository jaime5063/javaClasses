package com.class10;

public class AllValuesFromArray {
	
	public static void main(String[] args) {
		
		
		char [] grades= {'a','b','c','d','e','f'};
		
		int a=2;
		
		System.out.println(grades[2]);
		// Prints Index at 2 = 'c'
		

		
		String [] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
			}
System.out.println();


// Print line of numbers
		double[] nums = { 1.1, 3.6, 5.0, 6.7 };
		double collect = nums.length; // this way on your FOR LOOP you don't have to guess your index count

		for (int n = 0; n < collect; n++) {
			System.out.print(nums[n] + " "); // print out NUMBERS until n becomes false
		}
	
// Print all values but
		// when value is Dog --> I love dogs
		
		String[] animal= {"cat","Dog", "Snake","Elephant"};
		
		for(int i=0; i<animal.length; i++) {
			
			if(animal[i].equals("Dog")) {
				System.out.println("I love Dogs");
			}else {
				System.out.println(animal[i]);
			}
		}
	


	
	
	
	}
		
		
		
	}


