package com.sujalchoudhari;

public class NOTES_11_VarArgs {

	public static void main(String[] args) {
		System.out.println("Average is: "+ average());
		System.out.println("Average is: "+ average(1,2,3));
		System.out.println("Average is: "+ average(1,2,3,4));
		System.out.println("Average is: "+ average(1,2,3,4,5));
		System.out.println("Average is: "+ average(1,2,3,4,5,6,7,100));
	}
	
	public static float average(int ...arr) { /// arr is varArgs
		if(arr.length == 0) return 0f;
		float sum=0f;
		for(int el:arr) {sum+= el;}	
		return sum/arr.length;
	}
}
