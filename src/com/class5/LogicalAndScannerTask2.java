package com.class5;

import java.util.Scanner;

public class LogicalAndScannerTask2 {

	public static void main(String[] args) {
		
		/* Write a program that will read three inputs of scores
		 * (quiz, mid term, and final scores) and 
		 * determine the grade based on the following rules
		 * 
		 * if the average score >=90 --> grade A
		 * if the average score >=70 and <90 --> grade B
		 * if the average score >=90 and <70 --> grade C
		 * if the average score >=90 --> grade F
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st score");
		int score=scan.nextInt();		
		System.out.println("Enter 2nd Score");
		int score2=scan.nextInt();		
		System.out.println("Enter 3rd Score");
		int score3=scan.nextInt();
		
		int averageScore=(score+score2+score3)/3;
		
		if(averageScore>=90) {
			System.out.println("Grade A");
		
		}else if(averageScore>=70 && averageScore<90) {
			System.out.println("Grade B");
		
		}else if(averageScore>=50 && averageScore<70) {
			System.out.println("Grade C");
		
		}else if(averageScore<50) {
			System.out.println("Grade F");
		}else {
			System.out.println("You have not been graded");
		}
		
		
		

	}

}
