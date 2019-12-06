package com.class27;

public class Student {

	public void study() {
		System.out.println("I study for 5 hours");
	}
	public void majorSubject() {
		System.out.println("My major is in Math");
	}
}

class SyntaxStudent extends Student{
	public void majorSubject() {
		System.out.println("My major is in QA Automation");
	}
	public void study() {
		System.out.println("I study for 8 hours");
	}
	public void onlineClass() {
		System.out.println("I attend my school online");
	}
}

class CollegeStudent extends Student{
	public void majorSubject() {
		System.out.println("My major is in Scienece");
	}
	public void study() {
		System.out.println("I study for 9 hours");
	}
	public void collegeName() {
		System.out.println("My school name is UCLA");
	}
}

class SchoolStudent extends Student{
	public void majorSubject() {
		System.out.println("My major is in Math");
	}
	public void study() {
		System.out.println("I study for 10 hours");
	}
	public void graduate() {
		System.out.println("I will graduate in 2 years");
	}
}
/* When overriding we CANNOT reduce a visibility of a method, but can be INCREASED
 * 
 * public--> protected--> default--> private
 */
