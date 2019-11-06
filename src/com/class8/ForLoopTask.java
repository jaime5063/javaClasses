package com.class8;

public class ForLoopTask {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i=0; i<=20; i+=2) {
			System.out.print(i+" ");
		}
		// 1st way print odd numbers 20-50
		System.out.println(" ");
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		//2nd way Print odd numbers 20-50
		System.out.println("");
		for(int i=20; i<=49; i+=2) {
			System.out.print(i+1+" ");
		}
		// 3RD way print odd numbers 20-50
		System.out.println("");
		for(int i=20; i<=50; i++) {
			if(i%2!=0) { // you can also do (i%2=1)
				System.out.print(i+" ");
			}
		}
		System.out.println("******************************************************");
		
		int sumAll=0;
		
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.print(sumAll);
		// 0  +  0  =  0  +  5  =  5  +  10  =  15  +  15  =  30  +  20  =  50
		// i    sum   sum    i    sum     i     sum     i     sum    i      sum
		System.out.println();
		
		int total=2;
		
		for (int y=1; y<=3; y++) {
			total=total*y;			
		}
		System.out.println(total); // total = 12
//______________________________________________________________________________________________________________________________
/*
 *  Write a code to find the sum of even & odd numbers
 *  from range 1 to 20
 *  expecting 2 outputs
 *  sum for odd nums=
 *  sum for even nums=		
 */
		//sum of even numbers 1-20
		int even=2;		
		for (int y=1; y<=9; y++) {
			even=even+2;
			System.out.print(even+" ");
		}
		System.out.println();
		
		
		
		// sum off odd numbers from 1-20
		int odd=1;
		for (int y=0; y<9; y++) {
			odd=odd+2;
			System.out.print(odd+" ");			
// 1+2=3,  3+2=5,      5+2=7,      7+2=9,     9+2=11,      11+2=13,    13+2=15,    15+2=17,    17+2=19
//(odd+2) (new odd+2) (new odd+2) (new odd+2) (new odd+2) (new odd+2) (new odd+2) (new odd+2) (new odd+2)	
		}
System.out.println("");

// TEACHER EXAMPLE:
		// The sum of even and odd numbers
		int sumEven=0;
		int sumOdd=0;
		
		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("Even sum total= " + sumEven);
		System.out.println("Odd sum total= " + sumOdd);
		
				
	}

}
