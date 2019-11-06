package com.class7;

import java.util.Scanner;

public class DoWhileTask {
	
	public static void main(String[] args) {
		
		// Ask user to enter name 5 times and out output should be
		
		Scanner task = new Scanner(System.in);

		int enter = 1;

		while (enter <= 5) {

			System.out.println("Please enter your name");
			String name = task.nextLine();
			System.out.println("Good afternoon " + name);

			enter++;
			
		}
		

	}

}
