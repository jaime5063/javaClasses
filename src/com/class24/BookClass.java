package com.class24;
public class BookClass {
	public static boolean book = true;
	String firstBookTittle;
	String secondBookTittle;
	int pagesRead;
	double bookPrice;
	BookClass(String favBookTittle, int pagesRead) {
		this.firstBookTittle = favBookTittle;
		this.pagesRead = pagesRead;
	}
	BookClass(String secondBookTittle, int pagesRead, double bookPrice) {
		this.secondBookTittle = secondBookTittle;
		this.pagesRead = pagesRead;
		this.bookPrice = bookPrice;
	}
	public void DisplayBook1() {
		System.out.println("It is " + book + " that I love books. " + " My first books i read is " + firstBookTittle
				+ " and i have read " + pagesRead + " Pages.");
	}
	public void DisplayBook2() {
		System.out.println("I have read " + secondBookTittle + " and I have read " + pagesRead
				+ "pages. The book cost me " + bookPrice);
	}
	public static void main(String[] args) {
		BookClass bClass = new BookClass("Lord of the Rings", 275);
		BookClass bClass2 = new BookClass("GOT", 187, 45);
		bClass.DisplayBook1();
		bClass2.DisplayBook2();
	}
}
/*Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
  Instance variables are being initialized
  Both Constructors are being executed
*/





