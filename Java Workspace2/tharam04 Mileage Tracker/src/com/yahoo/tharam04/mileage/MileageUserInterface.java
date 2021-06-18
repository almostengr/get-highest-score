package com.yahoo.tharam04.mileage;

import java.util.Scanner;

public class MileageUserInterface {

	private static Scanner sc = new Scanner(System.in);
	public static MileFileInterface mfi = new MileFileInterface();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int menuSelection = 0;
		boolean exitProgram = false; 
		
		while (exitProgram == false) {
			displayMenu();
			menuSelection = sc.nextInt();
			
			switch (menuSelection) {
				case 1:
					displayAddEntry();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					exitProgram = true;
					System.out.println("Good bye.");
					break;
				default:
					System.out.println("Invalid selection. Please try again.");
					System.out.println();
					break;
			} // end switch (menuSelection) 
		} // end while (exitProgram == false)
	} // end public static void main(String[] args)
	
	private static void displayMenu() {
		System.out.println("Mileage Tracker - Main Menu");
		System.out.println("1. Add Entry");
		System.out.println("2. Display Summary Report");
		System.out.println("3. Delete Log File");
		System.out.println("4. Exit");
		System.out.println();
		System.out.print("Enter selection: ");
	} // end private static void displayMenu() 
	
	private static void displayAddEntry() {
		String startDate; 
		String endDate; 
		String startMileage;
		String endMileage; 
		String description;
		
		System.out.print("Start Date: ");
		startDate = sc.next();
		System.out.print("End Date: ");
		endDate = sc.next();
		System.out.print("Starting Mileage: ");
		startMileage = sc.next();
		System.out.print("Ending Milage: ");
		endMileage = sc.next();
		System.out.print("Description: ");
		description = sc.next();
		
		mfi.saveNewEntry(startDate, endDate, startMileage, endMileage, description); // save entry
	} // end private static void displayAddEntry() 

	private static void displayDeleteLogFile() {
		String confirmDelete;
		
		System.out.print("Are you sure you want to delete the log file (cannot be undone)? ");
		confirmDelete = sc.next();
		
		if (confirmDelete.equalsIgnoreCase("Y")) {
			mfi.fileDeleteLog();
		}
	} // end private static void displayDeleteLogFile()
}
