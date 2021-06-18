package com.yahoo.tharam04.mileage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
// import java.util.Date;

import org.omg.CORBA.portable.ValueOutputStream;

public class MileFileInterface {
	// private static String logFileName = "C:\\Documents and Settings\\ThaRam\\Desktop\\log" + Calendar.YEAR + ".csv";
	// private static String currentYear = (String) Calendar.YEAR;
	private static String currentYear = String.valueOf(Calendar.YEAR);
	private static String logFileName = System.getProperty("java.class.path") + "\\log" + currentYear + ".csv"; 
	private static File f = new File(logFileName);

	private static boolean fileEmpty() throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader(f));
		boolean returnVal = false;
		
		try {
			if (br.readLine() == null) {
				returnVal = true;
			}
			else{
				returnVal = false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnVal;
	}
	
	public static void saveNewEntry(String tripStartDt, String tripEndDt, String tripStartMi, String tripEndMi, String desc) {
		
		try {
			FileWriter fileOutput = new FileWriter(f, true);
			// int fileLength = (int) f.length();
			if (fileEmpty()) {
				fileOutput.write("Start Date, End Date, Start Miles, End Miles, Description\r\n");
				fileOutput.write(tripStartDt + ", " + tripEndDt + ", " + tripStartMi + ", " + tripEndMi + ", " + desc + "\r\n");
			}
			else{
				fileOutput.write(tripStartDt + ", " + tripEndDt + ", " + tripStartMi + ", " + tripEndMi + ", " + desc + "\r\n");
			}
						
			System.out.println("Entry saved.");
			System.out.println("");
			
		} catch (IOException e) {
			// fileOutput.close();
			// System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	} // end public static void saveNewEntry(String tripStartDt, String tripEndDt, int tripStartMi, int tripEndMi, String desc)
	
	private static boolean fileExistsLog() {
		boolean returnVal;
		
		if (f.exists()) {
			returnVal = true;
		}
		else{
			returnVal = false;
		}
		
		return returnVal;
	} // end private static boolean fileExists()
	
	
	private static void fileCreateLog(){
		try {
			f.createNewFile();
			System.out.println("Log file created.");
		} catch (Exception e) {
			System.out.println("Log file could not be created.");
			System.out.println(e.getStackTrace());
		}
	} // end private static void fileCreate()
	
	public void fileDeleteLog() {
		System.out.println("Deleting...");
		f.delete();
		System.out.println("Deleted.");
	}
	
} // end 
