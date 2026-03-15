package com.capg.Bean;

public class BookDTO {
	private String id;
    private String title;
    private String author;
    private String isbn;
    private double price;

    public BookDTO() {}

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }

    public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) { this.price = price; }
}
