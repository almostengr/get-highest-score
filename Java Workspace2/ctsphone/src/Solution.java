import java.io.*;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		String defaultAreaCode = null; 
		String inputText = null;
		String prefixNumber = null;
		String extensionNumber = null;
		int counter = 1;
		boolean repeat = true;
		
		while (repeat == true){
			// System.out.println("Enter a phone number: ");
			Scanner sc = new Scanner(System.in);

			inputText = sc.nextLine();

			if (inputText.toString() == "STOP"){
				System.out.println("exiting...");
				System.exit(0);	
			}
			else{
				if (counter == 1){
					// get the default area code
					defaultAreaCode = inputText;
				}
				else{
					// inputText.to
					inputText.replaceAll("[^0-9]", "");  // remove non numeric
					
					switch (inputText.length()) {
						case 7:
							prefixNumber = inputText.substring(0, 3);
							extensionNumber = inputText.substring(3);
							System.out.println("(" + defaultAreaCode + ") " + prefixNumber + "-" + extensionNumber);
							break;
						case 10:
							String areaCode = null;
							areaCode = inputText.substring(0,3);
							prefixNumber = inputText.substring(3, 6);
							extensionNumber = inputText.substring(6);
							System.out.println("(" + areaCode + ") " + prefixNumber + "-" + extensionNumber);
							break;
						default:
							System.out.println("ERROR");
							break;
					}
				}
				
				counter++;
			}
		}
		
	}
}
