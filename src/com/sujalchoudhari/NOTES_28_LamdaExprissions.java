package com.sujalchoudhari;

@FunctionalInterface
interface Display {
	void print(String s);
}

//class Out implements Display {
//	public void print(String s) {
//		System.out.println(s);
//	}
//}


interface MethodA{
	void display();
}

public class NOTES_28_LamdaExprissions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Out out = new Out();
//		out.print("Hello");
//		
		
		// Anonymous Class
//		Display display = new Display() {
//
//			@Override
//			public void print(String s) {
//			}
//		};
//		
//		display.print("Anonymous Hello");
		
		Display help = (s) -> {
			System.out.println(s);
		};
		
		help.print("KSJHKAJHKSJH");
		
	}

}
