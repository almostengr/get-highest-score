package com.yahoo.tharam04.Exam2.Prob3;

import java.util.Scanner;

public class GradeBook {

	private static final int NUMBER_A = 4; 
	private static final int NUMBER_B = 5;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int grade[][];
		int grades[][] = new int[NUMBER_A][NUMBER_B];
		double studentSum[] = new double[NUMBER_A];
		double quizSum[] = new double[NUMBER_B];
		
		System.out.println("I am filling the grade array for you");
		
		grades[0][0] = 10;
		grades[0][1] = 10; 
		grades[0][2] = 10; 
		grades[0][3] = 10;
		grades[0][4] = 5;
		
		grades[1][0] = 2;
		grades[1][1] = 0;
		grades[1][2] = 1;
		grades[1][3] = 10;
		grades[1][4] = 5;
		
		grades[2][0] = 8;
		grades[2][1] = 6;
		grades[2][2] = 9;
		grades[2][3] = 10;
		grades[2][4] = 5;
		
		grades[3][0] = 8;
		grades[3][1] = 4;
		grades[3][2] = 10;
		grades[3][3] = 10;
		grades[3][4] = 5;
		
		System.out.println("Done.");
		
		computeStudentSum(grades, studentSum);
		computeQuizSum(grades, quizSum);
		display(grades, studentSum, quizSum);
		
		
		com.yahoo.tharam04.swapvalues.Swapper.systemPause();
	}

	private static void computeStudentSum(final int grade[][], final double studentSum[]){
		for (int studentNumber = 1; studentNumber <= NUMBER_A; studentNumber++){
			double sum = 0; //initialize sum value 
			
			for(int quizNumber = 1; quizNumber <= NUMBER_B; quizNumber++){
				sum += grade[studentNumber-1][quizNumber-1];
			}
			
			studentSum[studentNumber-1] = sum; //set the sum for each student 
		}
	}
	
	private static void computeQuizSum(final int grade[][], final double quizSum[]){
		
		for (int quizNumber = 1; quizNumber <= NUMBER_B; quizNumber++){
			
			double sum = 0;
			
			for (int studentNumber = 1; studentNumber <= NUMBER_A; studentNumber++){
				sum += grade[studentNumber-1][quizNumber-1];
			}
			
			quizSum[quizNumber-1] = sum;
		}
	}
	
	private static void display(final int grade[][], final double studentSum[], final double quizSum[]){
		
		
		for(int studentNumber = 1; studentNumber <= NUMBER_A; studentNumber++){
			// %[flags][width][.precision] conversion-character
			String quizOutput = "";
			
			// System.out.printf("%-s10", "Student", "Row Total", "Quizzes");
			
			for(int quizNumber = 1; quizNumber <= NUMBER_B; quizNumber++){
				quizOutput += grade[studentNumber-1][quizNumber-1] + " ";
			}
			
			System.out.println("Student Number: " + studentNumber + "; Student Sum: " + studentSum[studentNumber-1] + "; Quiz Sum: " + quizOutput);
			// System.out.printf("%-", studentNumber, studentNumber[studentNumber-1], )
		}
		
		System.out.print("Column Total: ");
		for(int quizNumber = 1; quizNumber <= NUMBER_B; quizNumber++){
			System.out.print(quizSum[quizNumber-1] + " " );	
		}
		System.out.println();
	}
}
