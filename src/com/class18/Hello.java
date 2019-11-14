package com.class18;

public class Hello {
		
	public static void main(String[] args) {
		
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Waqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Paraguay");
		obj.sayHelloDifferentLanguage("Mexico");
		obj.sayNameAndAge("Jaime", 33);
		obj.isSnowing(false);
		obj.isSnowing(true);
		
	}
	/* Create a method that will say hello in different language based
	 * on the value that will be passed when user calls a method
	 */
	
	void sayHelloDifferentLanguage(String country) {
			
		switch (country.toLowerCase()) { // all cases must be lower case .toLowerCase
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "paraguay":
			System.out.println("Hola");
			break;
		case "albania":
			System.out.println("Pershendetje");
			break;
			default:
				System.out.println("I do not know how to say hello in your language");
		}				
	}
	
	// method to say name and age
	void sayNameAndAge(String name, int age) { // setting our parameters
		
		System.out.println("My name is "+name+" and I am "+age+" years old");
		// access variable in the MAIN METHOD to call this METHOD	
	}
	
	// create a method that will check if it is snowing
	// if snow --> stay at home, otherwise go for a walk
	void isSnowing(boolean isSnowing){
		
//		boolean isSnowing=false;  --> we do not want to hard code
		
		if(isSnowing) {
			System.out.println("Stay at home");
		}else {
			System.out.println("Go for a walk");
		}		
	}
	
void sayHello(String name){ // METHOD WITH PARAMETERS
		
		System.out.println("Hello "+name);		
		
	}
}

