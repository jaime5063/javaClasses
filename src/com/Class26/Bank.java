package com.Class26;

public class Bank {
	
	double money;
	
	public double chargeFee() {
		double fee=0;
		if(money<1000) {
			fee=money*0.1;
		}else {
			fee=0;
		}
		return fee;
	}
}

class PNC extends Bank{
	public double chargeFee() {
		double fee=0;
		if(money<1000) {
			fee=money*0.2;
		}else {
			fee=0;
		}
		return fee;
	}
}