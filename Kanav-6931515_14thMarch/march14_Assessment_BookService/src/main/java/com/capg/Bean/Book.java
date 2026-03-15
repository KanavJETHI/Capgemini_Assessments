package com.capg.Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@Column(name="BOOK_ID")
	private String bookId;
	
	
	private String title;
	private String author;
	
	@Column(name="ISBN", unique=true)
	private String isbn;
	
	
	private double price;
	
	public Book() {
		
	}

	public Book(String bookId, String title, String author, String isbn, double price) {

		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
}
