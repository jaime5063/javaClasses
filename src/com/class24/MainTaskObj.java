package com.class24;

import com.class24Task.TaskAccess;

public class MainTaskObj {

	char initial;
	
	MainTaskObj(char myInitial){
		initial = myInitial;
	}
	
	public static void main(String[] args) {
		
		TaskObj task1 = new TaskObj("Jaime");
		task1.displayMe();
		TaskObj task2 = new TaskObj("Salcedo", 33);
		task2.displayMe();
//		TaskObj task3 = new TaskObj(double 180); // --> Private not able to access from anothe class
		MainTaskObj task4 = new MainTaskObj('J');
//		task4.displayMe(); - from this class constructor I cannot access public "displayMe" from another class
		
		//Different package
		TaskAccess pack = new TaskAccess("Lakers"); // compiler asked me to import and change "TaskAccess" to Public
		TaskAccess pack2 = new TaskAccess(16); // compiler asked me to import and change "TaskAccess" to Public
		

	}

}
