package com.tek.teacher;

import org.springframework.stereotype.Component;

@Component("product1")
public class Product {
	
	private int productId;
	private String productName;
	private double price;
	
	
	public Product() {
		System.out.println("Product object Created");
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
