package com.sujalchoudhari;

public class EX_03_StarPattern {

	public static void main(String[] args) {
		String str = "*";
		int layers = 10;
		for(int i =layers;i >= 1; i--) {
			System.out.println(str.repeat(i));
		}
	}
}
