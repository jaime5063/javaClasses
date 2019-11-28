package com.class24;

public class TaskObj {
	
	String name, lastName;
	int age;
	double weight;
	
	
	public TaskObj(String myName){
		name = myName;
	}
	protected TaskObj(String myLastName, int age) {
		lastName = myLastName;
	}
	private TaskObj(double myWeight) {
		weight = myWeight;
	}
	public void displayMe() {
		System.out.println(name+" "+lastName+" "+age+" "+weight);
	}

}
