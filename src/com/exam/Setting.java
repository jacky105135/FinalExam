package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Setting {

	List<Menu> menu = new ArrayList<>();
	List<Customer> c = new ArrayList<>();

	public void readmenu() {
		try {
			FileReader file = new FileReader("menu.txt");
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();

			while (line != null) {
				String[] a = line.split(",");
				int id = Integer.parseInt(a[0]);
				String name = a[1];
				int price = Integer.parseInt(a[2]);
				String kcal = a[3];
				int count = 0;
				menu.add(new Menu(id, name, price, kcal, count));
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void on() {
		boolean run = true;
		int order = 0;
		while (run) {
			for (Menu m : menu) {
				System.out.println(m.getId() + ") " + m.getName());
			}
			System.out.println("0) " + "結算");
			System.out.println("q) " + "離開(結束應用程式)");
			System.out.println("請輸入餐點:");

			Scanner s = new Scanner(System.in);
			String function = s.nextLine();
			String name;
			int price;
			int count;
			
			switch (function) {

			case "1":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu a = menu.get(Integer.parseInt(function) - 1);
				name = a.getName();
				price = a.getPrice() * count;
				c.add(new Customer(order,name,count,price));
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;

			default:
				break;
			}
		}
	}
}
