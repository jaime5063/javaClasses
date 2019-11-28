package com.class24;

public class TaskStudent {
	
	String name;
	String address;
	
	TaskStudent(String name, String address){
		this.name =  name;
		this.address = address;
	}
	public void displayInfo() {
		System.out.println("My name is "+name+" and i live in "+address);
	}	
	public static void main(String [] args) {
		
		TaskStudent student = new TaskStudent("Bob", "1414 deneric LA NY 90000");
		student.displayInfo();		
	}
}
/*Write program as a Student class   that has instance variables name and address. 
Create a constructor that will initialize those variables. Print name & address of given  student by the displayInfo method.

Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
*/


