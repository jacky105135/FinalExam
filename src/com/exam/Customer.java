package com.exam;

public class Customer {
	int order;
	String name;
	int num;
	int price;
	
	public Customer(int order, String name, int num, int price) {
		super();
		this.order = order;
		this.name = name;
		this.num = num;
		this.price = price;
	}
	public Customer(){
		
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}