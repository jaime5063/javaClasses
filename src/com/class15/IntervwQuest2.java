package com.class15;

import java.util.Arrays;

public class IntervwQuest2 {

	public static void main(String[] args) {


		// Write program to find second largest num in the array
		int [] array = {100, -90, 8787, 898, 0, 1};
		// 1 easiest way
		Arrays.sort(array); // sort method.  Order, lowest to largest
		int min=array[0]; // first element of my array
		int max=array[array.length-1]; // last element of my array
		
		System.out.println(min);
		System.out.println(max);
		
		
		// 2nd Way
		int [] myArray = {100, -90, 8787, 898, 0, 1};
		int largest=myArray[0];
		int smallest=myArray[0];

		for(int i=0; i<myArray.length;i++) {
			
			if (myArray[i]>largest) {
				largest=myArray[i];
			}
			if (myArray[i]<smallest) {
				smallest=myArray[i];
			}
		}
		System.out.println("Largest numer= "+ largest);
		System.out.println("Smallest number= "+ smallest);
		System.out.println();
		
		
		
		
		
		// Write program to find second largest num in the array
		int [] nums = {100, -90, 8787, 898, 0, 1};
		int large=nums[0];
		int secondLarge=nums[0];
		
		for(int i=0; i<nums.length;i++) {
			
			if(nums[i]>large) {
				secondLarge=large;
				large=nums[i];				
			}
			if(nums[i]>secondLarge && nums[i]<large) {
				secondLarge=nums[i];
			}	
		}
		
		System.out.println("The largest number is = "+large);
		System.out.println("The second largest number is = "+secondLarge);

	}

}
