package com.class12;

public class TwoDArrayRecapDemo {

	public static void main(String[] args) {
		
		int [][] array1=new int [2][3];
		
		//Ror 
		array1[0][0]=9;
		array1[0][1]=10;
		array1[0][2]=11;
		
		/// Second Row
		array1[1][0]=9;
		array1[1][1]=10;
		array1[1][2]=11;

		for(int i[]: array1) {
			
			for(int j: i) {
				System.out.println(j);
			}
		}
		
		System.out.println("==================");
		
		int [][] array2= {
				{44,55,67},
				{11,22,33}
		}; 

		for(int[] twoD: array2) {
			for(int random2: twoD) {
				System.out.println(random2);
			}
		}
		
		
	}

}
