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
				menu.add(new Menu(id, name, price, kcal));
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
		int kcal = 0;
		int total = 0;
		
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
				kcal = kcal + Integer.parseInt(a.getKcal());
				c.add(new Customer(order,name,count,price));
				total = total + price;
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;

			case "2":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu b = menu.get(Integer.parseInt(function) - 1);
				name = b.getName();
				price = b.getPrice() * count;
				kcal = kcal + Integer.parseInt(b.getKcal());
				total = total + price;
				c.add(new Customer(order,name,count,price));
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;
				
			case "3":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu d = menu.get(Integer.parseInt(function) - 1);
				name = d.getName();
				price = d.getPrice() * count;
				kcal = kcal + Integer.parseInt(d.getKcal());
				total = total + price;
				c.add(new Customer(order,name,count,price));
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;
				
			case "4":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu e = menu.get(Integer.parseInt(function) - 1);
				name = e.getName();
				price = e.getPrice() * count;
				kcal = kcal + Integer.parseInt(e.getKcal());
				total = total + price;
				c.add(new Customer(order,name,count,price));
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;
				
			case "5":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu f = menu.get(Integer.parseInt(function) - 1);
				name = f.getName();
				price = f.getPrice() * count;
				kcal = kcal + Integer.parseInt(f.getKcal());
				total = total + price;
				c.add(new Customer(order,name,count,price));
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;
				
			case "6":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu g = menu.get(Integer.parseInt(function) - 1);
				name = g.getName();
				price = g.getPrice() * count;
				kcal = kcal + Integer.parseInt(g.getKcal());
				total = total + price;
				c.add(new Customer(order,name,count,price));
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;
				
			case "7":
				order++;
				System.out.println("請輸入數量:");
				count = s.nextInt();
				Menu h = menu.get(Integer.parseInt(function) - 1);
				name = h.getName();
				price = h.getPrice() * count;
				kcal = kcal + Integer.parseInt(h.getKcal());
				total = total + price;
				c.add(new Customer(order,name,count,price));
				System.out.println("目前餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + "　" + customer.getNum() + "份");
				}
				System.out.println("=================");
				break;
				
			case "0":
				System.out.println("所有餐點:");
				for (Customer customer : c) {
					System.out.println(customer.getOrder() + ". " + customer.getName() + customer.getNum() + "份");
				}
				System.out.println("合計 " + total);
				if(kcal > 1200){
					System.out.println("高熱量餐點");
				}
				run = false;
				
				break;
			
				
			case "q":
				run = false;
				break;
				
			default:
				break;
			}
		}
	}
	public void restart(){
		c.removeAll(c);
		on();
	}
}
