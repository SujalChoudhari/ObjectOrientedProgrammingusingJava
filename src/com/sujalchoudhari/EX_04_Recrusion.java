package com.sujalchoudhari;

public class EX_04_Recrusion {

	public static void main(String[] args) {
		System.out.println(factorial(10));
		fibbonacci(10);
	}
	
	public static long factorial(int x) {
		if(x<=1) return 1;
		return factorial(x-1) * x;
	}
	
	public static void fibbonacci(int times) {
		int f1=0,f2=1,fib=0;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0;i <times;i++) {
			fib = f1 +f2;
			f1= f2;
			System.out.println(fib);
			f2 = fib;
		}
	}
}
