package com.class21;

public class StudentTask {
/*2. Create a Class called Students
● Create three variables studentName , studentID and numberOfStudents
● Create three objects of the Students Class
● Set the value for studentName , studentID and increment the numberOfStudents for each object
● Print out total number of students
 */	
	public String studentName;
	public String studentID;
	public static int numberOfStudents; // current value is default value of integer = 0
	
	public static void main(String[] args) {
		
		StudentTask s1 = new StudentTask();
		s1.studentName="Ali";
		s1.studentID="DD8";
		StudentTask.numberOfStudents++; // incrementing the number of students every time I create an object
		
		StudentTask s3 = new StudentTask();
		s3.studentName="Micheal";
		s3.studentID="DD12";
		StudentTask.numberOfStudents++; // incrementing the number of students every time I create an object
		
		StudentTask s5 = new StudentTask();
		s5.studentName="Sam";
		s5.studentID="DD35";
		StudentTask.numberOfStudents++; // incrementing the number of students every time I create an object
		
		System.out.println("The total number of students is: "+ StudentTask.numberOfStudents);
	}
	
}
