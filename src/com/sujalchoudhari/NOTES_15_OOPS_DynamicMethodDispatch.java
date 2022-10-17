package com.sujalchoudhari;


class SuperClass{
	int a;
	void run() {
		System.out.println("SuperClass is Running");
	}
	
	void stop() {
		System.out.println("SuperClass is Waiting");
	}
}


class SubClass extends SuperClass{
	void run() {
		System.out.println("SubClass is Running");
	}
	
	void walk() {
		System.out.println("SubClass is Walking");
	}
}


public class NOTES_15_OOPS_DynamicMethodDispatch {

	public static void main(String[] args) {
		/*
		 * Dynamic Method Dispatch
		 * At runtime PolyMorphism
		 * 
		 * Methods From the SuperClass are called,
		 * But if method is Inherited, it is called.
		 */
		SuperClass obj = new SubClass();
		//SubClass obj2 = new SuperClass(); Error 
		
		obj.run();
		obj.stop(); 
		//obj.walk(); Error -> SuperClass doesn't contain walk method(); 

	}

}
