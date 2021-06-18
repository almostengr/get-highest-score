import java.io.*; 

public class Solution {
	public static void main(String[] args) {
		
		String xvalue;
		String yvalue;
		Console jConsole = System.console();
		
		/*
		System.out.println("Enter X value:");
		xvalue = System.console().readLine("ad");
		System.out.println("Enter Y value:");
		yvalue = System.console().readLine();
		
		 */
		
		xvalue = jConsole.readLine("x value:");
		
		if( xvalue != null){

			System.out.println(xvalue);	
		}
		
	}

}
