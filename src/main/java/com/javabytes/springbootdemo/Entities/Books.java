package com.javabytes.springbootdemo.Entities;

public class Books {
	
	private int bookId;
	private String bookName;
	private String author;
	private String description;
	
	
	public Books(int bookId, String bookName, String author, String description) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.description = description;
	}
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthors() {
		return author;
	}
	public void setAuthors(String authors) {
		this.author = authors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", authors=" + author + ", description="
				+ description + "]";
	}
	
	

}
