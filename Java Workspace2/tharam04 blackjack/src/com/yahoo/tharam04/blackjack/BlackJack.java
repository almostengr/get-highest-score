package com.yahoo.tharam04.blackjack;

// import java.util.Scanner;
import java.util.*;

public class BlackJack {
	
	private static String keepPlaying = "Y";
	private final String CARDVALUES[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	private final int CARDPOINTS[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	private static char dealerCards[];
	private static int dealerSum = 0;
	private static char playerCards[];
	private static int playerSum = 0;
	
	public BlackJack(){
		dealerCards = new char[10];
		playerCards = new char[10];
	} // end public static void BlackJack()

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(keepPlaying == "Y" || keepPlaying == "y") {
			playGame();
			System.out.println("Play again? (Y/N)");
			keepPlaying = sc.next();
			keepPlaying = keepPlaying.toUpperCase();
		} // end while(keepPlaying == "Y")
		sc.close();
	} // end public static void main(String[] args) 

	private static void playGame(){
		
	} // end private static void playGame()
	
} // end public class BlackJack
