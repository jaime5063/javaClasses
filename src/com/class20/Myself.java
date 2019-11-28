package com.class20;

public class Myself {
	
	public static void main(String[] args) {
		mySonMath son1 = new mySonMath();
		son1.name = "Esnar";
		
		son1.add();
		
		son1.add2(2, 3);
		
		int result =son1.add3();
		System.out.println(result);
		
		int result4 = son1.add4(5, 7);
		if(result4 == 12) {
		System.out.println("Great job");
		}else {
			System.out.println("Not good enough");
		}
	}
	

}
