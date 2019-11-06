package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		
		Scanner money=new Scanner(System.in);
		
		System.out.println("Please enter loan amount needed: ");
		int loan=money.nextInt();
		
		if (loan<2000000) {
			System.out.println("I will loan you the money");
		}else {
			System.out.println("I will reject the clinet");
		}
		
		Scanner dmv= new Scanner(System.in);
		System.out.println("Please enter age: ");
		int age=dmv.nextInt();
		if (age>=18) {
			System.out.println("I will issue you Driver Lisence");
		}else {
			System.out.println("I will offer learners permit");
		}
		
		Scanner temp= new Scanner(System.in);
		
		
		System.out.println("Enter city: ");
		String city=temp.nextLine();
		System.out.println("Enter the temperature: ");
		int degrees=temp.nextInt();
		
		int temp1=80;
		
		
		

	}

}
