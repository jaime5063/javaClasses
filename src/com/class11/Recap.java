package com.class11;

public class Recap {

	public static void main(String[] args) {
		
//		int num1=12;
//		int num2=13;
//		int num3=16;
//		
//		int num4=13, num5=50, num6=33;
//		int a,b,c;
//		
//		a=12;
//		b=33;
		
		// Array declaration:
//		int [] h=new int[3]; 
//		int e[];
//		int y[],u;
//		y=new int[3];
//		// u=new int[2];  will not compite
//		u=12;
//		
//		// easiest way
//		int[] array=new int[6];
//		
//		
//		
//		
//		// another way, here you are declaring the size 
//		int [] numberList= {2, 3, 5, 7};
//		
//		// In order not to get error, you will have to identify which value you need
//		// for Java to recognize and print		
//		System.out.println(numberList[1]);
//		
//		
//		for(int s =0; s< numberList.length; s++) {
//			System.out.println(numberList[s]);
//		}
//		
//		// for each loop
//		for(int elemen:numberList) {
//			System.out.println(elemen);
//		}
		// allows us to print each index from array without having to use for loops
		
		
		
		//  Task (Print 2 different ways)
		String [] carList= {"Toyota", "BMW", "Hummer", "Lexus", "Mercedez", "Farrari" };
		for(String cars:carList) {
			System.out.println(cars);	
		}
		System.out.println("------");
		
		for(int i=0; i<carList.length; i++) {
			System.out.println(carList[i]);
		}
//______________________________________________________________________
		//Task 2
		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		
		int math []= {1, 5, 10};
		int sum=0;
		for(int i=0; i<math.length; i++ ) {
			sum = sum + math[i];
		}
		System.out.println("First way to get Sum of array");
		System.out.println(sum);
		
	
		System.out.println("Second Way to get sum of array");
		int[] varia= {45, 78, 12, 46, 99};
        int add=0;
        for(int n:varia) {
            add+=n;
        }
        System.out.println(add);
        
        
        /*
         * 
		Create an array of countries. 
		While retrieving all values from an array print capital for each country. (use 2 different loops).
         */
        
        // NEED TO FIX AND COMPLETER
		String[] myCountries = { "Mexico", "USA", "Canada" };
		for (int i = 0; i < myCountries.length; i++) {
			if (myCountries[i].equals("Mexico")) {
				System.out.println("Mexico DF");
				if (myCountries[i].equals("USA")) {
					System.out.println("Washington DC");
					if (myCountries[i].equals("Canada")) {
						System.out.println("Ottawa");

					}
					System.out.println(myCountries[i]);
					
				}

			}
		}
	}

}
