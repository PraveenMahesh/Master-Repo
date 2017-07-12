package com.springdemo.beanwiring;

public class Student {
	private String name;
	private Book bookRef;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBookRef() {
		return bookRef;
	}
	public void setBookRef(Book bookRef) {
		this.bookRef = bookRef;
	}
}
