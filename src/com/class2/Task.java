package com.class2;

public class Task {

	public static void main(String[] args) {
		
		//Class Task
				//1. Create a Java program and name it Variables
				//create different type of variables to store students info and then print value
				//of those variables: Name, LastName, grade, city, state, phoneNumber
				//2. Change student city, state, phone number and grade. Print updated values. 
				String programName="Variables";
				
				String name1="Jaime";
				String LastName="Salcedo";
				char grade='B';
				String city="Los Angeles";
				String state="California";
				long phoneNumber1=3332221123l;
				
				city="culverCity";
				state="Nevada";
				phoneNumber1=444333221;
				grade='A';
				
				System.out.println(name1 + " " + LastName + " " + grade + " " + city + " " + state + " " + phoneNumber1);
				
				String text1="My name is ";
				String text2="I live in the city of ";
				String text3="My phone number is ";
				
				System.out.println(text1 + name1);
				System.out.println(text2 + city);
				System.out.println(text3 + phoneNumber1);
	
				//Task
				//Print: The Price of Banana is $1.99
				String Fruit="Banana ";
				char dollar='$';
				double price=1.99;
				String tittle="The Price of ";
				
				System.out.println(tittle + Fruit + "is " + dollar + price);
				
				
				
	}
	
}
