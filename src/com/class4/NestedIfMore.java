package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
	/* Check are, if age is less than 16 = You are too young to drive
	 * Otherwise = you are legible to drive & we will check if you are older than 18 = You can get DL
	 * IF not you can get drivers permit
	 */
		
		int age=16;
		
		if (age < 16) {
			System.out.println("You are too young to drive"); // false (Not LESS than 16)
		}else {
			System.out.println("You are elegible to drive"); // True
			if (age>=18) {
				System.out.println("You can drive alone"); // false (Not GREATER than 18)
				}else {
					System.out.println("You need your parents to drive"); // True
			}
		}
		System.out.println("*******************");
		
		
		/*
		 *  we need to check if student completed the quiz
		 *  if they did = Good Job
		 *  if not = Not good
		 *  if the completed = Check score --> if more that 90 "You got an A"
		 *  								   if 80 "You got a B" / less "You should study more"
		 */
		
		boolean quiz=false;
		int    Score=91;
		
		if (quiz) {
			System.out.println("Good Job");
			if (Score>90){
				System.out.println("You got an A");
			}else if(Score>80) {
				System.out.println("You got a B");
			}else {
				System.out.println("Study more");
			}
		}else {
			System.out.println("Not Good");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
