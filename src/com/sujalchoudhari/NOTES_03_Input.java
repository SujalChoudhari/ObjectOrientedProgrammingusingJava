package com.sujalchoudhari;

import java.util.Scanner; // For taking inputs

public class NOTES_03_Input {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter No 1: ");
			int a = scanner.nextByte();
			System.out.println("Enter No 2: ");
			int b = scanner.nextByte();
			System.out.println(a+b);
		}	
	}

}
