package com.exam;

public class Menu {
	int id;
	String name;
	int price;
	String kcal;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKcal() {
		return kcal;
	}

	public void setKcal(String kcal) {
		this.kcal = kcal;
	}

	public Menu(int id, String name, int price, String kcal) {
		super();
		this.id = id;
		this.name = name;
		this.kcal = kcal;
		this.price = price;
	}

	public Menu() {
		
	}

	public boolean show(String function) {
		boolean show = false;
		if(Integer.parseInt(function) == getId()){
			show = true;
		}
		return show;
	}
	
}
