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
	
	public void readmenu() {
		try {
			FileReader file = new FileReader("menu.txt");
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();
			
			while(line != null){
				String[] a = line.split(",");
				int id = Integer.parseInt(a[0]);
				String name = a[1];
				int price = Integer.parseInt(a[2]);
				String kcal = a[3];
				menu.add(new Menu(id, name, price ,kcal));
				line = br.readLine();
			}
			for (Menu m : menu) {
				System.out.println(m.getId()+ ") " + m.getName() );
			}
			System.out.println("0) " + "結算");
			System.out.println("q) " + "離開(結束應用程式)");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void on() {
		Scanner s = new Scanner(System.in);
		readmenu();
		System.out.println("請輸入餐點");
		String function = s.nextLine();
		while(function!= "q"){
			switch (function) {
			case "1":
				
				break;

			default:
				break;
			}
		}
	}
	
}
