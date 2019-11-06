package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		
//		String[] actualNames= {“Jhon”, “Smith”,“Alex”,“Tanaz”};
//        Arrays.sort(actualNames);       
//        String[] expectedNames= { “Smith”,“Jhon”,“Alex”,“Tanaz”};       
//        //To sort the elements of an Array
//        Arrays.sort(expectedNames);        
//        System.out.println(Arrays.toString(actualNames));       
//        String actual=Arrays.toString(actualNames);
//        String expected=Arrays.toString(expectedNames);      
//        System.out.println(actual.equals(expected));
		
		
		// Sorted numbers 
		int[] numbers= {111, 15, 55, 1,99};
		Arrays.sort(numbers);  // --> allows you to sort the numbers
		for (int i:numbers){  
			System.out.print(i+" ");
		}
		System.out.println();
		
		// Not sorted numbers
		int[] number2nd= {111, 15, 55, 1,99};
		for(int i:number2nd) {
	System.out.print(i+" ");
		}
		
		
		
		
		
		
		
	}

}
