package com.yahoo.tharam04.assignment6a;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class BankAccount {

	private static double balance; 
	private static double totalDue;
	
	public BankAccount(){
		totalDue = 0;
		balance = 0;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputFileName;
		Scanner sc = new Scanner(System.in);
		
		
		
		do{
		} while(true);
	}

	private static String readFile(String fileName){
		char[] charbuff;
		String fileContents; 
		
		try {
			File fileStream = new File(fileName);
			FileReader fileReader = new FileReader(fileStream);
			
			
			fileReader.read(charbuff);
			fileReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// fileReader.close();
			fileContents = "";
		}
		
		return fileContents; 
	}
	
	private static void saveFileData(String inputData){
		
	}
	
}
