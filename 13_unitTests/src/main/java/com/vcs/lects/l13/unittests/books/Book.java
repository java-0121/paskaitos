package com.vcs.lects.l13.unittests.books;

public class Book {

	private String codeISBN;
	private String name;
	private String author;
	private int pages;

	private boolean available;

	public Book(String codeISBN, String name, boolean available) {
		this.codeISBN = codeISBN;
		this.name = name;
		this.available = available;

	}

	public String getCodeISBN() {
		return codeISBN;
	}

	public void setCodeISBN(String codeISBN) {
		this.codeISBN = codeISBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
