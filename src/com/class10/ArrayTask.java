package com.class10;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		char [] grades= {'A', 'B', 'C', 'D', 'F'};
		System.out.println("Your grade is "+grades[1]);
		
		char [] myGrade=new char[5];
		myGrade[0]='A';
		myGrade[1]='B';
		myGrade[2]='C';
		myGrade[3]='D';
		myGrade[4]='E';
		System.out.println("Your grade is "+myGrade[0]);
		
// task 2		
// String names
		
		// 1st
		String[] names= {"John", "Alex","Brian", "Jaime", "Paul"};
		System.out.println("Your name is "+names[3]);
		//2nd
		String[] name=new String[3];
		name[0]="John";
		name[1]="Jaime";
		name[2]="Mat";
		System.out.println("Your listed name is "+name[1]);
		
//String Sentence Array
		
		String [] words= {"Java", "Saturday "," Day "," coding "};
		System.out.println(words[1]+" is "+words[0]+words[3]+words[2]);
		
	}

}
