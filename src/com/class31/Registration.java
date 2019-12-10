package com.class31;

public class Registration {
/*Create Registration Class in which you would have variables as email, userName and password 
 * that have an access scope only within its own class. 
 * After creating an object of the class user should be able to call methods 
 * and in each method separately pass values to set users email, username and password. 

 * Requirements: 
	Valid email consider to be only gmail
	Valid userName and password cannot be empty and should be of length larger than 6 characters. 
	Also valid password cannot contain userName.
 */
	private String email;
	private String userName;
	private String password;

	public String getEmailName() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmailName(String email) {
		if (email.contains("@gmail.com")) {
			System.out.println(email);
			this.email = email;
		}else {
			System.out.println("Email must be gmail");
		}
		
	}

	public void setUserName(String userName) {
		if (userName.length() <= 0) {
			System.out.println("Username cannot be left empty");
		} else if (userName.length() <= 6) {
			System.out.println("Username must be larger than 6 digits");
		}
		if (userName.length() > 6) {
			System.out.println(userName);
			this.userName = userName;
		}
	}

	public void setPassword(String password) {
		this.password = password;
		if (password.length() <= 0) {
			System.out.println("Password cannot be left empty");
		} else if (password.length() <= 6 || password.contains(userName)) {
			System.out.println("Invalid password");
		}
		if (password.length() > 6) {
			System.out.println("Password entered successfully");
		}
	}
}
