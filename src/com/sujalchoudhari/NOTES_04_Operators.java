package com.sujalchoudhari;

public class NOTES_04_Operators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a=0,b=3,c=4,d=10;
		boolean temp;
		
		// Assignment Operators
		a = b;
		c += d;
		
		// Arithmetic Operators
		b++; 
		c--;
		a = b *c;
		
		// Comparison Operators
		temp = (a == b);
		temp = (a <=b);
		
		// Logical Operators
		temp = (a != b);
		temp = (true || false);
		temp = (true && false);
		
		// Bitwise Operators
		a = b & c;
		d = c | d; 
		
		// Precedence and Associativity
		// Runs Left to right. * and / are prioritized over + and -
		
		
		// Increment Operators;
		int i = 10;				// i  | display
		System.out.println(i); 	// 10 | 10
		System.out.println(i++);// 11 | 10
		System.out.println(i);	// 11 | 11
		System.out.println(++i);// 12 | 12


		

	}

}
