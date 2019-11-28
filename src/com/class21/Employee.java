package com.class21;

public class Employee {
	
	int eID;
	double salary;
	public static String CEO;
	
	public void info() {
		System.out.println("Employee ID is "+eID+" makes "+salary+" and works under "+CEO);
	}

	public static void main(String[] args) {
		Employee.CEO = "Sumair";
		
		Employee one = new Employee();
		one.eID = 12345;
		one.salary = 1000;
	
		Employee two = new Employee();
		two.eID = 54321;
		two.salary = 2000;
		
		one.info();
		two.info();	
	}
	
	
}
