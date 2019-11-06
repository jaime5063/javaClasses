package com.class4;

public class NestedIfTask {

	public static void main(String[] args) {
		/* 
		 * 
		 */

		boolean diploma = false;
		double gpaScore = 3.2;

		if (diploma) {
			System.out.println("Congratulations you have a diploma");
		} else {
			System.out.println("You do not have a diploma");
			if (gpaScore < 3.5) {
				System.out.println("You should have studied harder");
			}
		}

		double mortageR = 4.3;
		int mortageP = 99999;

		if (mortageR < 4.5) {
			System.out.println("Will consider buying the house");
			if (mortageP < 200000) {
				System.out.println("I will pay cash");
			}else {
				System.out.println("I will take out a loan");
			}
		} else {
			System.out.println("Will Not consider buying the house");

		}
	}

}
