package com.capg.Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ORDER")
public class Order {
	
	@Id
	@Column(name="ID")
	private Long id;
	
	private String bookId;
	private String customerName;
	private int quantity;
	private double totalPrice;
    private String status;

    
    
    public Order() {}
    
    public Order(String bookId, String customerName, int quantity, double totalPrice, String status) {
        this.bookId = bookId;
        this.customerName = customerName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public Long getId() { return id; }

    public String getBookId() { return bookId; }

    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getTotalPrice() { return totalPrice; }

    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
	

}
