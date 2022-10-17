package com.sujalchoudhari;

public class NOTES_09_Arrays {

	public static void main(String[] args) {
//		int[] squares= new int[10];
//		
//		
//		for(int i=0;i<10;i++) {
//			squares[i] = i*i;
//		}
//		
//		for(int i=0;i<10;i++) {
//			System.out.println(squares[i]);
//		}
//		System.out.println(squares.length);
			
		// Multidimensional array
		int[][] wierd = {
					{10,20,30,40,50},
					{60,70,80,90,100},
					{1,2,3,4,5,6,7,8,9,10}
				};
		
		// Printing using for-each loop
		for(int[] el: wierd) {
			for(int el2:el) {
				System.out.println(el2);
			}
		}
	}

}
