package com.class10;

public class IntroToArrays {
	
	public static void main(String[] args) {
		
		// This of an array as a bigger bucket of values such as (Integers, Strings etc.)
		
		int [] b; // Declaring an array (PREFERED WAY) --> Step 1
		int c []; // 2nd way				
		b=new int[4]; // (Initialize) we will have 4 elements inside our array -- Step 2
		

		// - OR - 
		int[] array = new int[4]; // We can do it all in one line
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;	
		//Access value from an array
		System.out.println(array[2]);
				
		// lets created an array that will store classes		
		String[] classes = new String[4];
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "Manual testing";
		classes[3] = "GIT";
		System.out.println("I am in " + classes[0] + " Class");
		
		//how can i change 1 to 100
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		// reasigning the value of [0]
		nums[0] = 100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[1]);

		
		String[] names= new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
//		names[3]="Last"; during run time we will get an exception
		// arrayIndexOutOFBoundException
		
		
		double[] numbers=new double[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		// will assign default value of double = 0.0
		// with a String you will get = null
		
		
		
		
		
		
	}

}
