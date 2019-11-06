package com.class7;

public class WhileDoWhileHW {
	
	public static void main(String[] args) {
/*
 * Create a while loop that prints out numbers from 0 to 8
	Must  include the number 8 in the output 
	Increment by 1 example(a++)
	Output:
0
1
2
3
4
5
6
7
8		
 */
//	int eightCount=0;
//	
//	while(eightCount<=8) {
//		System.out.println(eightCount);
//		eightCount++;
//	}
//________________________________________________________________________________________________________________________________		
/*
 * Create a while loop that prints out numbers from 0 to 15
	Must include the number 0 in the output 
	Decrement by 1 (example(a--))		
	OUTPUT: 15--> 0
 */
//	int a=15;
//	
//	while(a>=0) {
//		System.out.println(a);
//		a--;
//	}
//________________________________________________________________________________________________________________________________
/*
 * Create a while loops that prints out even numbers from 1 to 13
	Must not include the number 13 in the output 
	Increment by 1 - example(a++)
 * 	OUTPUT: 2,4,6...12
 */
	
//	int b=1;
//	
//	while(b<=12) {
//		
//		 if (b%2==0) {
//			 System.out.println(b);
//		 }
//		 b++;
//	}
//________________________________________________________________________________________________________________________________
/*
 * Write a java program to print  "Hello Syntax Solutions! How are you?"  three times using the while loop

	Step 1: Initialize the value int i=1

	Step 2: Write the while loop conditions and print the output "Hello Syntax Solutions! How are you?"  three times		
 */
//	int i=1;
//	
//	while(i<=3) {
//		System.out.println("Hello Syntax Solutions! How are you?");
//		i++;
//	}
//________________________________________________________________________________________________________________________________
/*
 * Print 1 to 10 Numbers except 7, 8, 9, 5  using the While loop
	Step 1: Initialize the i value as int i=1
	Step 2: Create the while loop to check the condition 
	Step 3: Write the if condition for validation part
	Step 4 : It should print
	1
	2
	3
	4
	6
	10		
	 */		
//		int i = 1;
//		while (i <= 10) {
//			if (!(i == 7) && !(i == 8) && !(i == 9) && !(i == 5)) {
//				System.out.println(i);
//			}
//			i++;
//		}
//_____________________________________________________________________________________________________________________________		
/*
 * Step 1: Initialize the i value as int i=7.
Step 2: Write a program to print a sequence of number starting from 7 to 98. 
Step 3: Think by what number it should be incremented. 
Output:
7 
14 
21 
28 
35 
42 
49 
56 
63 
70 
77 
84 
91 
98
 */
//		int z = 7;
//
//		while (z <= 98) {
//			System.out.println(z);
//			z = z + 7;
//
//		}
//_______________________________________________________________________________________________________________________________		
/*
 * For you to do: 
	Create a do while loop that prints out numbers from 10 to 20
	Must not include the number 20 in the output 
	Increment by 1 within the do example:
	do  {
	a++;
	 }		
 */
//		int a =10;
//		do {
//			System.out.println(a);
//			a++;
//		}while(a<20);
//_______________________________________________________________________________________________________________________________
/*
 *  Copy solution from previous assignment (#55). 
	Change the condition in while to false value and execute your code. 		
 */
//		int a =10;
//		do {
//			System.out.println(a);
//			a++;
//		}while(a>20);
//_______________________________________________________________________________________________________________________________
/*
 * Create a do while loop that prints out "Hello World!" 5 times. 
	Increment by 1 within the do example:
	do  {
	a++;
	 }		
 */
	int hw=1;
	
	do {
		System.out.println("Hello World");
		hw++;
	}while(hw<=5);
		
		
		
		
	}
	}

