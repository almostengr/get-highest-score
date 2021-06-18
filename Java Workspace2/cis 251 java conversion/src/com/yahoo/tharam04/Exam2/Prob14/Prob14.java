package com.yahoo.tharam04.Exam2.Prob14;

public class Prob14 {
	
	public static void main(String args[]){
		problem14();
	}
	
	private static void problem14(){
		System.out.println("Problem 14");
		
		int ARRAYSIZE = 10;
		int numbers[] = new int[ARRAYSIZE];
		int value = 0;
		int sum = 0; 
		
		for(int i = 0; i < ARRAYSIZE; i++){
			numbers[i] = value;
			value += 10;
		}
		// NUMBERS = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		sum = getArraySum(numbers, ARRAYSIZE);
		System.out.println("The array sum is " + sum);
	}

	private static int getArraySum(final int n[], final int size){
		int num = 0; 
		int sum = 0; 
		int arrayNum = 0;
		
		arrayNum = size - 1;
		
		
		
		do{
			System.out.println(arrayNum + " = " + n[arrayNum]);
			num = n[arrayNum];
			sum = sum + num;
			arrayNum--;
		} while(arrayNum >= 0);
		
		return sum;
	}
}
