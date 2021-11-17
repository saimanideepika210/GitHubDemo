package com.cg.entity;

public class Product {
	private int pcode;
	private String pname;
	private int price;
	private int stock;
	public Product(int pcode, String pname, int price, int stock) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.stock = stock;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price=" + price + ", stock=" + stock + "]";
	}
}
