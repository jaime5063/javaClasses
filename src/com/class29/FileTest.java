package com.class29;

public class FileTest {

	public static void main(String[] args) {
		
		File_task java = new JavaFile();
		java.open();
		java.edit();
		java.close();
		
		File_task word = new WordFile();
		word.open();
		word.edit();
		word.close();
		
		File_task pdf = new PDFFile();
		pdf.open();
		pdf.edit();
		pdf.close();

	}

}
