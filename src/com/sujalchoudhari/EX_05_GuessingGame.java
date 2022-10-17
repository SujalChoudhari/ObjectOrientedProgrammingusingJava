package com.sujalchoudhari;

import java.util.Random;
import java.util.Scanner;

class GuessingGame {
	private int m_Random;
	public int playerGuess;

	private Random m_Rd;
	private Scanner m_Sc;

	public GuessingGame() {
		m_Rd = new Random();
		m_Sc = new Scanner(System.in);
		m_Random = m_Rd.nextInt(0, 101);
	}

	public void takeUserInput() {
		System.out.print("EWelcome to Guessing Game");
		System.out.print("Enter a Guess: ");
		playerGuess = m_Sc.nextInt();
	}

	public boolean compare() {
		if (playerGuess == m_Random) {
			System.out.println("The Correct number was: "+ m_Random+" \nYou WIN!");
			return true;
		} else if (playerGuess > m_Random) {
			System.out.println("Big! Your number is Bigger");
			return false;
		} else {
			System.out.println("Small! Your number is Smaller");
			return false;
		}
	}
}

public class EX_05_GuessingGame {

	public static void main(String[] args) {

		GuessingGame game = new GuessingGame();

		do {
			game.takeUserInput();
		} while (!game.compare());

	}

}
