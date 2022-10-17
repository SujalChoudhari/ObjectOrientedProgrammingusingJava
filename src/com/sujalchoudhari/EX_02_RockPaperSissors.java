package com.sujalchoudhari;

import java.util.Scanner;
import java.util.Random;

public class EX_02_RockPaperSissors {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		char[] options = { 'r', 'p', 's' };
		System.out.println("ROCK PAPER SISSORS");
		System.out.print("Enter your choice: [r/p/s]\n>>> ");
		char choice = sc.next().charAt(0);
		char computer = options[rd.nextInt(3)];
		System.out.println("Computer chose: " + computer);

		if (choice == computer) {
			System.out.println("Tie");
		} else if (choice == 'r') {
			if (computer == 'p') {
				System.out.println("You Lose!");
			} else if (computer == 's') {
				System.out.print("You Win!");
			}
		} else if (choice == 'p') {
			if (computer == 's') {
				System.out.print("You Lose!");
			} else if (computer == 'r') {
				System.out.println("You Win!");
			}
		} else if (choice == 's') {
			if (computer == 'r') {
				System.out.println("You Lose!");
			} else if (computer == 'p') {
				System.out.println("You Win!");
			}
		}
	}
}
