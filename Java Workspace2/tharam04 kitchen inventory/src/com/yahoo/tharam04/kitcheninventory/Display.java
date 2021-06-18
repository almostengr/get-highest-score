package com.yahoo.tharam04.kitcheninventory;

import java.util.Scanner;

public class Display {
	static Scanner sc = new Scanner(System.in);
	static FileUtils fu = new FileUtils();

	public static void menuMain(){
		System.out.println("Kitchen Inventory - Main Menu");
		System.out.println("Kitchen Inventory - Main Menu");
		System.out.println("Make a selection:");
		System.out.println("1. Add item");
		System.out.println("2. Checkout item");
		System.out.println("3. Display Grocery List");
		System.out.println("4. Exit");
	}

	public static void addItem() {
		String upc; 
		String name; 
		int qty;
		
		System.out.println("Enter item UPC");
		upc = sc.next();
		System.out.println("Enter item name");
		name = sc.next();
		System.out.println("Enter item qty");
		qty = sc.nextInt();
		
	}
}
