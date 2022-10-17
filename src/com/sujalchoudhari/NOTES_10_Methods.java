package com.sujalchoudhari;

public class NOTES_10_Methods {	
	public static void main(String[] args) {
		System.out.print(add(10,2.0f));
		System.out.print(add(10,20));
		System.out.print(add(10,20.10d));
		
	}

	// method and overloading
	static float add(int a,int b) {
		return (float) (a + b);
	}
	
	static float add(int a,float b) {
		return (int)(a + b);
	}
	
	static float add(int a,double b) {
		return (float) a + (float)b;
	}
}
	