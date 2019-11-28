package com.class19;

public class Student {
	
	char getGrade(int grade) {	
		char grades;
		if(grade>90) {
			grades = 'A';
		}else if(grade>80){
			grades = 'B';
		}else if(grade>70) {
			grades = 'C';
		}else if(grade>50){
			grades = 'D';
		}else{
			grades = 'F';
		}		
		return grades;
	}
	public static void main(String[] args) {
	
		Student grades = new Student();
			char finalGrade = grades.getGrade(50);
		System.out.println(finalGrade);	
	}
}
