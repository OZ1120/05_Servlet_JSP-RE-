package edu.kh.jsp.controller;

public class Book {

	// 필드에 private 왜씀?
	// 외부로 부터의 직접접근 막기위해서
	private String title;
	private String writer;
	private double price;
	
	// 기본 생성자
	// 생성자란 뭐여 : 객체만들때 실행되는것/ 객체 생성될때 실행되는것
	public Book() {
	}

	public Book(String title, String writer, double price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
