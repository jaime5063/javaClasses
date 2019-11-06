package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {

		// Advanced Loop (Look at examples online
		
		// The only framework that really requires arrays is TESTng
		// (Will probably not use much but you never know)
		// 2D array 
			// Multiple rows
			// multiple columns
		
		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[2]=14;
		
		
		
		System.out.println(array1[1]);
		
		for(int i=0; i<array1.length; i++) {
			
			System.out.println("Print index "+i);
			System.out.println("Print value "+array1[i]);
			System.out.println();
		}
		System.out.println();
		
		//----------------
		// FOR EACH LOOP - only to retrieve values from lists.
		// Simplify with the for each loop (Single Array)
		// This is the Syntax for each loop line 34 - 36
		for(int s: array1) { 
			System.out.println("Coming from the For Each Loop "+s);
		}
		System.out.println("-----------");
		
		
		
		int [] array2= {2,5,4,7};
		
		for(int s: array2) { 
//			if(s==4) {					--> EXAMPLE of IF condition
//				System.out.println(s);
//			}
			System.out.println("Coming from second For Each Loop "+s);
		}
		
		
	}

}
