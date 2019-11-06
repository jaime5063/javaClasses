package com.class7;

public class WhileLoopTask {
	
	public static void main(String[] args) {
		
//		int odd=51;
//		
//		while(odd<=100) {
//			System.out.print(odd+", ");
//			odd+=2;
//		}
//		System.out.println(" ");
//		int even=100;
//		
//		while(even>1) {
//			System.out.print(even+", ");
//			even-=2;
//		}
		// Print even number using While loop and increment operator
		int even=2;
		
		while(even<=50) {
			System.out.print(even+", ");
			even++;			
		}
		// Print odd numbers using While loop and decrement operator
		System.out.println("");
		int odd=99;
		
		while(odd>50) {
			System.out.print(odd+", ");
			odd-=2;
		}
//_______________________________________________________________________________________________________________________________		
		/*
		 *  Create boolean value workDay and assign true
		 *  As long as it is workDay print "I need a day off" and increase day
		 *  Once day is 6 print "I do not need a day off anymore"
		 */
		
		// FIRST WAY OF PRINTING
//		boolean workDay=true;
//		int day=1;
//		
//		while(workDay && day<=6) {
//			System.out.println("I need a day off");
//			if(day==6) {
//				System.out.println("I do not need the day off anymore");
//			}
//			day++;		
//		}
//__________________________________________________________________________________________________________________-
		System.out.println("");
		
		// 2ND WAY OF PRINTING
		boolean workDay = true;
		int day = 1;

		while (workDay) {
			if (day == 6) {
				workDay = false;
				System.out.println("I do not need the day off anymore");
			} else {
				System.out.println("I need a day off");
			}
			day++;
		}

	}

}

