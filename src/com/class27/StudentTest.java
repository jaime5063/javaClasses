package com.class27;

public class StudentTest {

	public static void main(String[] args) {
		
		Student schools = new SyntaxStudent();
		schools.study();
		schools.majorSubject();
		SyntaxStudent sSchool = new SyntaxStudent();
		sSchool.onlineClass();
		
		Student schools1 = new CollegeStudent();
		schools1.study();
		schools1.majorSubject();
		CollegeStudent cSchool = new CollegeStudent();
		cSchool.collegeName();
		
		Student schools2 = new SchoolStudent();
		schools2.study();
		schools2.majorSubject();
		SchoolStudent sStudent = new SchoolStudent();
		sStudent.graduate();
	}

}




