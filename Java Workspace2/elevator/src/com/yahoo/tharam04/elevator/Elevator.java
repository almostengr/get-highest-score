package com.yahoo.tharam04.elevator;

import java.util.Scanner;

/**
 * 
 * @author ThaRam
 *
 */
public class Elevator {

	private static boolean goingUp;
	private static int currentFloor;
	private static int floorStop[];
	private static int floorMax;
	private static int floorMin;
	private static boolean doorOpen;
	
	public static void Elevator(){
		goingUp = true;
		currentFloor = 1; 
		floorMax = 25;
		floorMin = 1;
		doorOpen = false;
		floorStop = new int[floorMax];
		
		for(int i = 0; i < floorMax; i++) {
			floorStop[i] = 0;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	} // end public static void main(String[] args)
	
	private static void selectFloor(String selection) {
		// if
	}

	private static void doorOpen(){
		System.out.println("Door opening...");
		doorOpen = true;
		// Thread.sleep(2000); // two seconds to open doors
		System.out.println("Door open.");
	} // end private static void doorOpen()
	
	private static void doorClose(){
		System.out.println("Door closing...");
		doorOpen = false;
		System.out.println("Door closed.");
	} // end private static void doorClose()
	
	private static void moveUp(){
		if (currentFloor < floorMax) {
			currentFloor++;
			displayCurrentFloor();
		}
		else if (currentFloor == floorMax) {
			changeDirections();
			displayCurrentFloor();
		}
	} // end private static void moveUp()
	
	private static void moveDown(){
		if (currentFloor > floorMin) {
			currentFloor--;
			displayCurrentFloor();
		}
	} // end private static void moveDown()
	
	private static void changeDirections(){
		goingUp = !goingUp;
	} // private static void changeDirections()
	
	private static void displayCurrentFloor() {
		System.out.println("Current Floor: " + currentFloor);
	} // end private static void displayCurrentFloor()
	
	private static void move(){
		if (goingUp == true) {
			
			
		}
	}
}
