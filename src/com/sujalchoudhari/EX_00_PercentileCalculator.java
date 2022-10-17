package com.sujalchoudhari;
import java.util.Scanner;

// Get marks of five subjects and Store them in a variable.
//	Display percentage for it

public class EX_00_PercentileCalculator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum  = 0,outOf = 0;
		for(byte i=1;i <6; i++) {
			System.out.println("Enter Your marks of Subject: " +i);
			sum += sc.nextByte();
			System.out.println("Enter Your Total marks of Subject: " +i);
			outOf += sc.nextByte();
		}
		float percentage = (float)sum / (float)outOf * 100.0f;
		System.out.println("Your Percentage is: "+ percentage);
	}
	
}
