package com.class29;

public abstract class File_task {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("edit");
	}
	public void close() {
		System.out.println("close");
	}
}
class JavaFile extends File_task{

	@Override
	public void open() {
		System.out.println("Open JavaFile");
	}
	@Override
	public void edit() {
		System.out.println("edit JavaFile");
	}
	@Override
	public void close() {
		System.out.println("close JavaFile");
	}
}
class WordFile extends File_task{

	@Override
	public void open() {
		System.out.println("Open WordFile");	
	}
	@Override
	public void edit() {
		System.out.println("edit WordFile");
	}
	@Override
	public void close() {
		System.out.println("close WordFile");
	}
}
class PDFFile extends File_task{

	@Override
	public void open() {
		System.out.println("Open PDF File");
	}
	@Override
	public void edit() {
		System.out.println("edit PDF file");
	}
	@Override
	public void close() {
		System.out.println("close PDF file");
	}
}
