package com.class11;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		
		// Declare 2D array
		
//		int [] [] array=new int [3][4]; // 3 Rows and 4 Columns				
//		//1st Row
//		array [0][0]=44;
//		array [0][1]=80;
//		array [0][2]=33;
//		array [0][3]=20;
//		
//		//end Row
//		array [1][0]=10;
//		array [1][1]=5;
//		array [1][2]=7;
//		array [1][3]=8;
//		
//		//3rd row
//		array [2][0]=10;
//		array [2][1]=9;
//		array [2][2]=70;
//		array [2][3]=80;
//		
//		System.out.println(array[1][3]);
		
		
		//Task
		// Create a 2D array of String, 2 rows and 3 columns
//		
//		String [][] names=new String [2][3];
//		
//		names [0][0]="Jaime";
//		names [0][1]="Jose";
//		names [0][2]="James";
//		
//		names [1][0]="Brian";
//		names [1][1]="John";
//		names [1][2]="Mat";
//		
//		System.out.println(names[1][1]);
		
	/*
	 * 2D Array of Strings
	 */
		
		
//		String [][] Names= {
//				
//				{"Kahn","Yousuf","Alex", "Zynab"},
//				{"John","Micheal","Mat","Shawn"},
//				{"Kobe","Shaq","Jordan","Giannis"}
//				
//		};
		
		
		int [][] age= {
				{1,2,3,4},
				{5,10,15,20},
				{10,20,30,45}
		};
		
		int sum=0; // add total sum
		for(int i=0; i<age.length; i++) {
			for(int j=0; j<age[i].length; j++) {			
				System.out.print(age[i][j]+" ");
				sum=sum+age[i][j]; // add total sum
			}
			System.out.println();
		}
		System.out.println("The sum of all elements in the array is: ="+sum); // add total sum
		
		int sum1=0;
		for(int nums[]: age) {
			for(int getNum:nums) {
				sum1=sum1+getNum;
			}
		}
		System.out.println("Second total: ="+sum1);
	}

}
