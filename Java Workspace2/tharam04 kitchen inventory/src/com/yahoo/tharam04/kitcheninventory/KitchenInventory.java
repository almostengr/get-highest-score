package com.yahoo.tharam04.kitcheninventory;

import java.util.Scanner;

public class KitchenInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menuSelection = 0;

		Scanner sc = new Scanner(System.in);
		// Display kiDisplay = new Display();
		
		while (menuSelection != 4){
			Display.menuMain();
			menuSelection = sc.nextInt();
			
			switch(menuSelection) {
				case 1:
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					// exit application
					break;
				default:
					System.out.println("Invalid selection. Please try again.");
					break;
			}
		}
		System.out.println("Exiting...");
	}
	
	
}
