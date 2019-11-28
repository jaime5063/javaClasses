package com.Class26;

public class WebDriverTest {

	public static void main(String[] args) {
		
		ChromeDriver chrome =new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FireFoxDriver firefox = new FireFoxDriver();
		firefox.refresh();
		firefox.open();
		
		//creating the object of child class and giving reference to the parent
		WebDriver driver = new FireFoxDriver();
		driver.open();
		driver.refresh();
//		driver.getTittle();--> not available because method is not available in parent class (WebDriver)
		
	}

}
