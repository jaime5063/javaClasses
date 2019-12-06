package com.class27;

public class Examples {
	// creating method
	public String helloName(String str) {
		return str;
	}
	// method overloading
	public String helloName(String str, String str2) {
		return str+" "+str2;
	}
}

class smallExample extends Examples{
	// method overriding
	public String helloName(String str) {
		return "Hello "+str;
	}
	
}
