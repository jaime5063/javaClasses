package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		
		
		// how to separate comma delimited string
		String str="If you come to class early, then you can study more, and you can leave early";
		
		String[] array=str.split(",");
		for(int i=0; i<array.length; i++) {	
			System.out.println(array[i]);
		}
		System.out.println("-------------------------------------");
		
		
		String str1="Welcome to Syntax Technologies";
		String [] array2=str1.split(" ", 3); // break it into 3 divided by the spaces
		System.out.println(array2.length); // what is the length of the array
		
		for(int i=0; i<array2.length; i++) { // run my array and print out my 3 part code
			System.out.println(array2[i]);
		}
		
		
		
		
		
		
		

	}

}
