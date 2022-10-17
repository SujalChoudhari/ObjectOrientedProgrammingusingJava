package com.sujalchoudhari;

import java.util.Scanner;

public class NOTES_05_Strings {
	// Strings are immutable.
	public static void main(String[] args) {
//		String a = new String("AA");
//		System.out.println(a);
//		System.out.printf("printf %d %f %c %s",1,1.3f,'a',"Hello");
//		System.out.format("printf %d %10.3f %c %s",1,1.3220110f,'a',"Hello");
		
		try (Scanner sc = new Scanner(System.in)) {
//			String newer = sc.nextLine();
//			System.out.println("\n\n"+newer);
		}
		
		
		// Sting methods
		String name = new String("ABCDEFGH");
//		System.out.println(name);
//		System.out.println(name.length());
//		System.out.println(name.charAt(2));
//		System.out.println(name.toLowerCase());
//		System.out.println(name.concat("IJK"));
		System.out.println(new String("     a-a---a     ").trim());
		System.out.println(name.substring(1,5));
		System.out.println(name.replace('A', 'Z'));
		
	}
}
