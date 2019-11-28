package com.class23;

public class Student {
	//instance variables 
	String name;
	int grade1, grade2, grade3;
	//constructor with 4 parameters
	Student(String studentName, int math, int english, int science){
		name=studentName;
		grade1=math;
		grade2=english;
		grade3=science;
	}	
	// Method to get average grades
	public void averageGrades() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("The average grade for "+name+" is "+average);
	}
	//initialize main method
	public static void main(String[] args) {
		//create object to call your constructor and method
		Student ave = new Student("Mike", 96, 98, 98); // CONSTRUCTOR 
		ave.averageGrades(); // METHOD
		Student ave1 = new Student("Kobe", 90, 94, 98);
		ave1.averageGrades();
		Student ave2 = new Student("LeBron", 90, 98, 99);
		ave2.averageGrades();
		Student ave3 = new Student("Magic", 90, 92, 94);
		ave3.averageGrades();
		Student ave4 = new Student("Shaq", 88, 96, 98);
		ave4.averageGrades();		
	}
}
/*
Write a java program of Class Students that takes students name and 3 subject grades. 
Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. 
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.*/
